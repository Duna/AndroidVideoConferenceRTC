# Video conference ⚡ with webRTC protocol

[![Build Status](https://openvidu.io/img/logos/openvidu_vert_white_bg_trans_cropped.png)](https://travis-ci.org/joemccann/dillinger)

Based on Open Vidu webRTC open source project

## Tech

- Client and server version: 2.21.0 -> newest version(May2022) will not work due to an issue

- Docker command line: 
```sh
docker run -p 4443:4443 --rm -e OPENVIDU_SECRET=secret -e DOMAIN_OR_PUBLIC_IP=192.168.10.114 openvidu/openvidu-server-kms:2.21.0
```

- Make sure the server IP matches the Docker command line and the Android's client resource string
```sh
app/strings/default_openvidu_url -> https://192.168.10.114:4443/
```

- Run the server and then the clients

**Enjoy!**
