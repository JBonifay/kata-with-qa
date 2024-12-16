# User Story

Title: Submit and Validate Feedback

```
As a customer of an e-commerce platform,    
I want to submit feedback about a product I purchased,  
So that my feedback can help other customers make informed decisions.   
```

## Acceptance Criteria

1. POST /feedback

The API should accept the following JSON payload:

```json
{
  "productId": "string",
  "userId": "string",
  "rating": "integer",
  "comment": "string"
}
```

- rating should be between 1 and 5.
- comment should be optional but, if provided, must have at least 10 characters.

2. Validation Rules:

- productId and userId are mandatory and should be alphanumeric.
- If rating is missing or out of range, the API must return HTTP 400 with a descriptive error message.

3. Success Response:

- HTTP 201 with the following body:

```json
{
  "feedbackId": "string",
  "message": "Feedback submitted successfully"
}
```

4. Failure Cases:

- Missing fields (productId, userId, rating).
- Invalid rating or comment.
- System error returns HTTP 500 with {"message": "Your feedback is invalid !"}.

