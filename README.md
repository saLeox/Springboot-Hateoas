# HATEOAS4springboot
A simple demo combines the usage of hateoas, springboot, swagger and knife4j.

A quick start:
Find the ProjectApplication and run as "Spring Boot App"

Display:

1, Open the url: http://localhost:8080/swagger-ui.html#!
you can access to swagger.

2, Open the url: http://localhost:8080/doc.html#
you can access to knife4j.

Implication:
The refs of available following operations are bound to the response entity separately.
Each public method within a controller can be refered and added as a link.
