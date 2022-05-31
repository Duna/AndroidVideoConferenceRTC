#Video conference demo project for webRTC
Based on Open Vidu webRTC open source project

Client and server version: 2.21.0 -> newest version(May2022) will not work due to an issue

Docker command line: docker run -p 4443:4443 --rm -e OPENVIDU_SECRET=secret -e DOMAIN_OR_PUBLIC_IP=192.168.10.114 openvidu/openvidu-server-kms:2.21.0

Make sure the server IP matches the command line and the android client resource string <string name="default_openvidu_url">https://192.168.10.114:4443/</string>

Run the server and then the clients

Enjoy!