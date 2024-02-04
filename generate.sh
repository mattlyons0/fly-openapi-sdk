#!/bin/sh

set -e

rm -rf go ruby python java

docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate -i https://docs.machines.dev/swagger/doc.json  -g ruby -o /local/ruby --additional-properties gemName=fly-sdk-ruby --additional-properties moduleName=FlySDK

docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate -i https://docs.machines.dev/swagger/doc.json  -g go -o /local/go --additional-properties packageName=fly-sdk

docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate -i https://docs.machines.dev/swagger/doc.json  -g python -o /local/python --additional-properties packageName=fly_sdk --additional-properties projectName=fly_sdk

docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate -i https://docs.machines.dev/swagger/doc.json  -g java -o /local/java --additional-properties apiPackage=io.fly.sdk --additional-properties artifactId=fly-sdk --additional-properties groupId=io.fly --additional-properties invokerPackage=io.fly.client --additional-properties modelPackage=io.fly.client.model --additional-properties library=resttemplate --additional-properties annotationLibrary=swagger2 --additional-properties generateClientAsBean=true --additional-properties useJakartaEe=true
