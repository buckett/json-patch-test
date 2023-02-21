# Project showing JSON Patch with Spring Data Rest

This simple project shows how you can create a person using Spring Data Rest and update their name using JSON patch, but
are unable to update their birthday using JSON patch because there's no support for converting from a String to a
LocalDate.

[patch-unsupported-conversion.http](patch-unsupported-conversion.http) - HTTP requests to show the issue.

See: https://github.com/spring-projects/spring-data-rest/issues/2233
