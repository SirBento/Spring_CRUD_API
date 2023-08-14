# Spring_CRUD_API

This repository contains a simple CRUD (Create, Read, Update, Delete) API implemented using Spring Boot. The API allows you to perform basic operations on a data resource, such as creating new entries, retrieving existing entries, updating entries, and deleting entries.

## Getting Started

To get started with this API, follow the instructions below.

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven

### Installation

1. Clone the repository to your local machine:

   ````shell
   git clone https://github.com/SirBento/spring-boot-crud-api.git
   ```

   ````

1. Navigate to the project directory:

   ````shell
   cd spring-boot-crud-api
   ```

   ````

1. Build the project using Maven:

   ````shell
   mvn clean install
   ```

   ````

### Usage

Once you have successfully built the project, you can run it using the following command:

```shell
mvn spring-boot:run
```

By default, the API will run on `http://localhost:8080`. You can access the API endpoints using a tool like cURL or a web client of your choice.

### API Endpoints

The following API endpoints are available:

- `GET /api/resource` - Retrieve all entries.
- `GET /api/resource/{id}` - Retrieve a specific entry by ID.
- `POST /api/resource` - Create a new entry.
- `PUT /api/resource/{id}` - Update an existing entry.
- `DELETE /api/resource/{id}` - Delete an entry.

Please note that for `POST` and `PUT` requests, you should include a JSON payload in the request body with the necessary data.

### Configuration

The API can be configured by modifying the `application.properties` file in the `src/main/resources` directory. You can change the database connection settings, server port, and other properties as needed.

### Contributing

If you find any issues with the API or have suggestions for improvements, please feel free to open an issue or submit a pull request. Your contributions are welcome!

### License

This project is licensed under the [MIT License](LICENSE).

### Acknowledgments

This project was inspired by the need for a simple CRUD API implementation using Spring Boot. It serves as a starting point for building more complex applications.

### Contact

If you have any questions or need further assistance, please feel free to contact me at [bernardtowindo38@gmail.com](mailto:bernardtowindo38@gmail.com).

Enjoy using the Spring Boot CRUD API!
