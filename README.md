# 

## Model
www.msaez.io/#/courses/cna-full/8ae59320-6341-11ef-b3d3-7d6354081d9f/ddd-google-drive

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- drive
- indexer
- notification
- dashboard
- video processing


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- drive
```
 http :8088/drives id="id" fileLocaton="fileLocaton" fileName="fileName" fileType="fileType" uploadDate="uploadDate" fileSize="fileSize" uploadStatus="uploadStatus" 
```
- indexer
```
 http :8088/indexers id="id" fileLocation="fileLocation" fileName="fileName" fileType="fileType" indexStatus="indexStatus" 
```
- notification
```
```
- dashboard
```
```
- video processing
```
 http :8088/videoprocessings id="id" fileName="fileName" fileType="fileType" videoUrl="videoUrl" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

