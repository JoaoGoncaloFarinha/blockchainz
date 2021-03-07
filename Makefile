.PHONY: install install-quick test verify

MAVEN_ARGS=-T 1C
MAVEN_CUSTOM_FLAGS=

install:
	mvn clean install

install-quick: MAVEN_CUSTOM_FLAGS=-PskipAll -P-assembly -DskipTests
install-quick: install

test:
	mvn clean test

verify:
	mvn clean verify