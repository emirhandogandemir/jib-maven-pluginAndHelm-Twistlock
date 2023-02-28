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

### Problem 1)

- Çözüm 1) Twistlock üzerinde credentials ekleyip kendi docker repomu registry olarak tanımlamam gerekir
 ![image](https://user-images.githubusercontent.com/74687192/221976671-e9fb8043-c53d-4a90-8b86-caf7c7f7704b.png)
 
 
- Çözüm 2) Twistlock free olarak container olarak çalıştırabilir miyim localimde 

`docker run -it --rm -p 8083:8083 -p 8084:8084 -p 8085:8085 -v /var/run/docker.sock:/var/run/docker.sock --name twistlock twistlock/defender:latest` çalışmadı.
