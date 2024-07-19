

From open jdk
EXPOSE 8089
copy ./target/employeeservice.jar employeeservice.jar
CMD ["java","-jar","employeeservice.jar"]