# School In The Cloud 

### API URL 
https://eschoolinthecloud.herokuapp.com/

## Terms Of Servie Http Requests
<details>
<summary> :arrow_down: </summary>

### GET Requests
Note: *Data for React I MVP Only*   


**List Terms Of Service --** https://eschoolinthecloud.herokuapp.com/terms/terms   
Example Output:

<details> 
<summary>https://eschoolinthecloud.herokuapp.com/terms/terms</summary>

```JSON
[
    {
        "tosid": 11,
        "paragraph": "You agree that by accessing the Site, you have read, understood, and agree to be bound by all of these Terms and Conditions."
    },
    {
        "tosid": 12,
        "paragraph": "If you do not agree with all of these Terms and Conditions, then you are expressly prohibited from using the Site and you must discontinue use immediately.\n"
    },
    {
        "tosid": 13,
        "paragraph": "Supplemental terms and conditions or documents that may be posted on the Site from time to time are hereby expressly incorporated herein by reference."
    },
    {
        "tosid": 14,
        "paragraph": "We reserve the right, in our sole discretion, to make changes or modifications to these Terms and Conditions at any time and for any reason.\n"
    },
    {
        "tosid": 15,
        "paragraph": "We will alert you about any changes by updating the “Last updated” date of these Terms and Conditions, and you waive any right to receive specific notice of each such change."
    }
]
```
<br/>

Note: *This data can be requested **WITHOUT** either **AUTHENTICATION** and / or **AUTHORIZATION** for React I MVP purposes only* 

</details>

</details>

## User Http Requests
<details>
<summary> :arrow_down: </summary>

### GET Requests

**List All Users --** https://eschoolinthecloud.herokuapp.com/users/users   
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

Note: *Finds usernames containing the string* <br/><br/>
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

</details>

