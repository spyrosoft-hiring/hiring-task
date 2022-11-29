# User Registration Service

Write a simple microservice that registers a user.

### Acceptance Criteria

- The application should expose an HTTP endpoint for user registration.
- User registration data will be passed in a request body. 
  
  Input user data:
  - first name
  - last name
  - username
  - email
  - date of birth
- Don't use a real database, users should be stored in memory. 
- Use in-memory DB (e.g. H2) or other mechanisms that allow for mutable shared state.
- Every restart of the microservice cleans up the database.
- The application should handle errors properly, 
  it should return appropriate error messages when a user with a given username or email already exists, etc.
- You can use whatever library you want. The more, the better.
- Don't forget about tests :)


***We really love Functional Programming.***

***So it would be nice to see this microservice written in functional way :)***


Good Luck.