# jib-maven-pluginAndHelm

## Jib Maven Plugin implementasyonu örnek project ve kaynaklar

- https://github.com/betul-sahin/springboot-docker-maven-jib-plugin/
- https://medium.com/patika-dev/spring-boot-uygulamasını-dockerize-etmek-ve-jib-maven-plugini-kullanımı-8b79fb29e740
- https://www.baeldung.com/jib-dockerizing
- https://medium.com/@sybrenbolandit/jib-maven-plugin-89c447473d76

## Helm 

![image](https://user-images.githubusercontent.com/74687192/221689453-8b510151-be36-4966-b11a-b1090eb03372.png)
https://helm.sh/docs/intro/install/
## Twistlock
![image](https://user-images.githubusercontent.com/74687192/221972214-6f0ede68-592c-43dd-92c5-443bb87efcd5.png)

### Problem 1)(Çözüldü)

- Çözüm 1) Twistlock üzerinde credentials ekleyip kendi docker repomu registry olarak tanımladım
 ![image](https://user-images.githubusercontent.com/74687192/221976671-e9fb8043-c53d-4a90-8b86-caf7c7f7704b.png)
 
![image](https://user-images.githubusercontent.com/74687192/225973453-0ebcbe17-90c5-4566-ba61-49839044d8fb.png)
![image](https://user-images.githubusercontent.com/74687192/225973654-c913dcc6-fd0a-40dd-8576-d18767afd43a.png)

 
## Twistlock
Monitor=>Images=>CI
![image](https://user-images.githubusercontent.com/74687192/225973807-7db13c38-13f3-49bf-a548-229671a95536.png)

![image](https://user-images.githubusercontent.com/74687192/225972317-fecae148-e850-40a4-887f-451999f3ebe4.png)

### Twistlock Taranan detaylı image çıktıları
![image](https://user-images.githubusercontent.com/74687192/225972555-1fdc5c3d-9214-4b25-826a-61208d236ab2.png)
![image](https://user-images.githubusercontent.com/74687192/225972590-db0482cf-30ca-4ae8-9f0b-56075e84725c.png)
