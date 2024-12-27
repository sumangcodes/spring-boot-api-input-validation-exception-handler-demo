# spring-boot-api-input-validation-exception-handler-demo

# GlobalExceptionHandler Demo

This project demonstrates a global exception handler in a Spring Boot application. The `GlobalExceptionHandler` class catches validation exceptions and returns a meaningful response to the client.

## Table of Contents
- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Example](#example)
- [Contributing](#contributing)
- [License](#license)

## Overview
The purpose of this project is to showcase how to handle validation exceptions globally using `@ControllerAdvice` and `@ExceptionHandler` annotations in a Spring Boot application.

## Prerequisites
- Java 8 or higher
- Maven

## Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/global-exception-handler-demo.git
    cd global-exception-handler-demo
    ```

2. Build the project:
    ```bash
    ./mvnw clean install
    ```

3. Run the application:
    ```bash
    ./mvnw spring-boot:run
    ```

## Usage
- The application exposes a POST endpoint `/api/products` to create a new product.
- If validation fails, the `GlobalExceptionHandler` catches the exception and returns a JSON response with the validation errors.

## Example
### Sample JSON Request
```json
{
    "name": "Sample Product",
    "price": 29.99
}
