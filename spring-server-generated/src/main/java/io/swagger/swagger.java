//openapi: 3.0.0
//        info:
//        title: Student API
//        description: API for Java Academy
//        version: 1.0.0
//        contact:
//        email: rohit@gmail.com
//    name: Rohit
//
//            paths:
//            /student:
//            get:
//            description: To fetch student
//            responses:
//            "200":
//            description: 200 response
//            content:
//            application/json:
//            schema:
//            $ref: "#/components/schemas/student"
//
//            post:
//            description: To Add Student
//            requestBody:
//            description: structure of Student
//            required: true
//            content:
//            application/json:
//            schema:
//            $ref: "#/components/schemas/student"
//            responses:
//            "200":
//            description: 200 response
//
//
//
//            components:
//            schemas:
//            student:
//            type: object
//            properties:
//            name:
//            type: string
//            course:
//            type: string
//            rollNo:
//            type: integer
//
//