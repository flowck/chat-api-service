## Quest

1. Accept incoming chat messages over HTTP
2. Serve up conversation history over HTTP

## Specifications

### `/messages/` Resource

The `/messages/` resource accepts HTTP POST actions to create new messages in the conversation. A typical message resource has the format of:

```javascript
{
    "sender": "anson",
    "converstaion_id": "1234",
    "message": "I'm a teapot"
}
```

Here, `"sender"` is a string username, `"conversation_id"` is a unique identifier for a particular conversation, and `"message"` is a string message to be logged to a conversation.

### `/conversations/<conversation_id>` Resource

The `/conversations/<conversation_id>` resource accepts an HTTP GET action and returns a list of conversation messages. A typical conversation as the format of:

```javascript
{
    "id": "1234",
    "messages": [
        {
            "sender": "anson",
            "message": "I'm a teapot",
            "created": "2018-01-17T04:50:14.883Z"
        },
        {
            "sender": "david",
            "message": "Short and stout",
            "created": "2018-01-17T04:52:17.201Z"
        }
    ]
}
```

Here, a conversation with two messages is presented.
