FROM payara/micro:latest
COPY target/root.war $DEPLOY_DIR
