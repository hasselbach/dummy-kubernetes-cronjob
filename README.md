## dummy-kubernetes-cronjob
# A dummy for Java Cronjobs on Kubernetes

# Build Jar
mvn clean package

# get MiniKube environment
eval $(minikube docker-env)

# Build docker image
docker build -t dummy-kubernetes-cronjob:1.0.0 .

# Create Cronjob
kubectl create -f kube/dummy-cron.yaml
