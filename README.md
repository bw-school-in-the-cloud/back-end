# School In The Cloud 

### API URL 
https://eschoolinthecloud.herokuapp.com/ 


## User Http Requests

### GET Requests

**List All Users --** https://eschoolinthecloud.herokuapp.com/users/users <br/>
Example Output:

<details>
<summary>https://eschoolinthecloud.herokuapp.com/users/users</summary>

```JSON
[
    {
        "userid": 4,
        "username": "admin",
        "primaryemail": "admin@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 5,
                "useremail": "admin@email.local"
            },
            {
                "useremailid": 6,
                "useremail": "admin@mymail.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 1,
                    "name": "ADMIN"
                }
            },
            {
                "role": {
                    "roleid": 2,
                    "name": "STUDENT"
                }
            },
            {
                "role": {
                    "roleid": 3,
                    "name": "VOLUNTEER"
                }
            }
        ]
    },
    {
        "userid": 7,
        "username": "student",
        "primaryemail": "student@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 8,
                "useremail": "student@mymail.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "STUDENT"
                }
            }
        ]
    },
    {
        "userid": 9,
        "username": "volunteer",
        "primaryemail": "volunteer@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 10,
                "useremail": "volunteer@email.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 3,
                    "name": "VOLUNTEER"
                }
            }
        ]
    }
]
```
</details>


**Find User By ID --** https://eschoolinthecloud.herokuapp.com/users/user/{id} <br/>
Example Output: 

<details>
<summary>https://eschoolinthecloud.herokuapp.com/users/user/4</summary>

```JSON
{
    "userid": 4,
    "username": "admin",
    "primaryemail": "admin@lambdaschool.local",
    "useremails": [
        {
            "useremailid": 5,
            "useremail": "admin@email.local"
        },
        {
            "useremailid": 6,
            "useremail": "admin@mymail.local"
        }
    ],
    "roles": [
        {
            "role": {
                "roleid": 1,
                "name": "ADMIN"
            }
        },
        {
            "role": {
                "roleid": 2,
                "name": "STUDENT"
            }
        },
        {
            "role": {
                "roleid": 3,
                "name": "VOLUNTEER"
            }
        }
    ]
}
```
</details>

**Find By Username --** https://eschoolinthecloud.herokuapp.com/users/user/name/{username} <br/>
Example Output:

<details>
<summary>https://eschoolinthecloud.herokuapp.com/users/user/name/admin</summary>

```JSON
{
    "userid": 4,
    "username": "admin",
    "primaryemail": "admin@lambdaschool.local",
    "useremails": [
        {
            "useremailid": 5,
            "useremail": "admin@email.local"
        },
        {
            "useremailid": 6,
            "useremail": "admin@mymail.local"
        }
    ],
    "roles": [
        {
            "role": {
                "roleid": 1,
                "name": "ADMIN"
            }
        },
        {
            "role": {
                "roleid": 2,
                "name": "STUDENT"
            }
        },
        {
            "role": {
                "roleid": 3,
                "name": "VOLUNTEER"
            }
        }
    ]
}
```
</details>

**Find Username Like (Similar) --** https://eschoolinthecloud.herokuapp.com/users/user/name/like/{string} <br/>
*Finds usernames containing the string* <br/>
Example Output: 

<details>
<summary>https://eschoolinthecloud.herokuapp.com/users/user/name/like/olu</summary>

```JSON
[
    {
        "userid": 9,
        "username": "volunteer",
        "primaryemail": "volunteer@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 10,
                "useremail": "volunteer@email.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 3,
                    "name": "VOLUNTEER"
                }
            }
        ]
    }
]
```
</details>

### POST Requests
*Sign up and/or Admin access only*

**Add New User --** https://eschoolinthecloud.herokuapp.com/users/user <br/>

<details>
<summary>Minimum Body</summary>

```JSON
{
    "username": "test-post",
    "primaryemail": "post@lambdaschool.local",
    "password": "newpassword",
    "roles": [
        {
            "role": {
                "roleid": 1
            }
        }
    ]
}
```

**OR**


```JSON
{
    "username": "add-user",
    "primaryemail": "new@lambdaschool.local",
    "password": "password",
    "roles": [
        {
            "role": {
                "name": "ADMIN"
            }
        }
    ]
}
```
<br/>
Note: *Role ID's can be sent as numbers or strings [{1, "Admin"}, {2, "Student"}, {3, "Volunteer"}*
</details>

<details>
<summary>Return</summary> <br/>

**Headers:** https://eschoolinthecloud.herokuapp.com/users/user/{id} <br/>
*Status: 201 Created*

</details>

### PUT Requests
*Admin access only*

**Update User --** https://eschoolinthecloud.herokuapp.com/users/user/15 <br/>

<details>
<summary>Minimum Body</summary>

```JSON
{
    "username": "test-post",
    "primaryemail": "update@lambdaschool.local",
    "password": "newpassword",
    "roles": [
        {
            "role": {
                "roleid": 1
            }
        }
    ]
}
```
</details>

<details>
<summary>Http Status</summary> <br/>

*Status: 200 Okay*

</details>

### PATCH Requests
*Admin access only*

**Update User --** https://eschoolinthecloud.herokuapp.com/users/user/15 <br/>

<details>
<summary>Minimum Body</summary>

```JSON
{
    "username": "test-post",
    "primaryemail": "newemail@lambdaschool.local"
}
```
</details>

<details>
<summary>Http Status</summary> <br/>

*Status: 200 Okay*

</details>

### DELETE Requests
*Admin access only*

**Delete User By ID --** https://eschoolinthecloud.herokuapp.com/users/user/{id} <br/>

<details>
<summary>https://eschoolinthecloud.herokuapp.com/users/user/15</summary> <br/>

*Status: 200 Okay*

</details>