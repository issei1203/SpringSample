**SpringBoot入門用**

**実行環境**

Java 11

docker 20.10.5 (dockerはDockerDesktopを入れるといいかも)

DockerDesktop
https://docs.docker.com/desktop/install/mac-install/

**実行方法**
```
docker compose up -d
```
1.dockerでmysql起動(ポート3316が空いてること)
```
gradle clean
```
2.一応初期化

```
gradle build
```
3.ビルド

```
gradle bootRun
```
4.これで多分動く

**動かなかったら**

issueに上げるか本人に教えて下さい
