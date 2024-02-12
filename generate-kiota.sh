#!/bin/sh

docker run --rm -v "/tmp/kiota:/local" mcr.microsoft.com/openapi/kiota \
generate --language java -n io.fly.sdk -c FlySdkClient -o /local/ --openapi \
https://docs.machines.dev/swagger/doc.json