# Hanko WebAuthn Quickstart Application

Sample application to demonstrate registration, authentication and de-registration of 
authenticator devices with the Hanko API.

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) 
* [Thymeleaf](https://www.thymeleaf.org/)
* [Gradle](https://gradle.org/) 
* [Hanko Java SDK](https://github.com/teamhanko/hanko-sdk-java)
* [Hanko JavaScript SDK](https://www.npmjs.com/package/hanko-webauthn)

## Getting Started

These instructions will get you the quickstart application up and running on your local machine.

### Prerequisites

- JDK 1.8+
- an API Key ID/API Key pair in order to make authorized calls to the Hanko API. To get an API Key ID/API Key pair:
    1. Go to the [Hanko Console](https://console.hanko.io)
    2. Log in or register an account
    3. Once signed in, create an organization. If you already created an organization, select the organization.
    4. Add a new relying party with the following properties:
        - Relying Party Name: choose any name you want
        - APP ID: **must** be `http://localhost` when using the sample application from a local environment. 
    5. Click "Add new Relying Party". Select the created relying party to get to the relying party dashboard.
    6. On the relying party dashboard, select "General Settings" and then click "Add" in the "API Keys" panel.
    This will generate an API Key and an API Key ID.  You should store the secret securely since it cannot be obtained once 
    you confirm and close the modal displayed after key generation. You will need the API Key ID/API Key pair to 
    configure the sample application (see [Configure Hanko Api Keys](#configure-hanko-api-keys)).

### Usage

#### Building the application

```
./gradlew build
```

#### Running the application

Build the application then either run:

```
java -jar build/libs/hanko-webauthn-quickstart-<VERSION>.jar
```

##### Using gradle's bootRun

You can run the application without building it first by running:

```
./gradlew bootRun
```

Once the application is running open your browser to `localhost:3000` to view the app.

### Configure Hanko API keys

You can configure the API key and secret for making authorized calls to the Hanko API either by editing the 
`application.properties` file or by using command line options.

#### Using properties file

1. Open the `application.properties` file
2. Edit your API key ID: `client.apiKeyId=<YOUR_API_KEY_ID>`
3. Edit your API key: `client.apiKey=<YOUR_API_KEY>`

#### Using command line options

##### Java

```
java -jar -Dclient.apiKeyId=<YOUR_API_KEY_ID> -Dclient.apiKeyId=<YOUR_API_KEY_ID> build/libs/hanko-webauthn-quickstart-<VERSION>.jar
```

##### Gradle 

```
./gradlew bootRun --args '--client.apiKeyId=<YOUR_API_KEY_ID> --client.apiKey=<YOUR_API_KEY>'
```

NOTE: If you're on macOS with zsh insert a space before the `--` of the `args`:

```
./gradlew bootRun --args ' --client.apiKeyID=<YOUR_API_KEY_ID> --client.apiKey=<YOUR_API_KEY>'
```
