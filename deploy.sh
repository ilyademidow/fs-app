#!/bin/bash

echo "Login to openshift"
oc login https://console.starter-us-east-1.openshift.com/
echo "Choosing project hello-world"
oc project ilyademidow-helloworld
echo "Cleaning..."
echo "Deleting routes..."
oc delete route --all
echo "Deleting services..."
oc delete service --all
echo "Deleting pods..."
oc delete pod --all
echo "Deleting deployments..."
oc delete deploymentconfig --all
echo "Creating new app..."
oc new-app --docker-image ilyademidow/fs-app:0.0.1-SNAPSHOT
echo "Waiting pods 60 sec..."
sleep 60
echo "Creating service..."
oc expose $(oc get pod | grep Running | awk '{print "pods/"$1}') --port=8080
echo "Creating route..."
oc expose $(oc get service --show-all=false -o name)
echo "==== end ===="
