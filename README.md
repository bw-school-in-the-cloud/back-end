# School In The Cloud 

### API URL 
https://eschoolinthecloud.herokuapp.com/   
   

![Step One](https://github.com/bw-school-in-the-cloud/back-end/blob/features/events/PostmanFlow1.png?raw=true)
   
![Step Two](https://github.com/bw-school-in-the-cloud/back-end/blob/features/events/PostmanFlow2.png?raw=true)
   
![Step Three](https://github.com/bw-school-in-the-cloud/back-end/blob/features/events/PostmanFlow3.png?raw=true)
   
![Step Four](https://github.com/bw-school-in-the-cloud/back-end/blob/features/events/PostmanFlow4.png?raw=true)

## Signing Up A New User

### POST
## TO https://eschoolinthecloud.herokuapp.com/createnewuser

Required Fields in **BOLD**   

## USER TABLE

Name | Data Type (min, max)
------------ | -------------
**Username**| **String**
**Password** | **String**
**Email** | **Email**   
   
**Role Type will defualt to Volunteer**

## Terms Of Service Requests
<details>
<summary> :arrow_down: </summary>

### GET REQs
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
    

Note: *This data can be requested **WITHOUT** either **AUTHENTICATION** and / or **AUTHORIZATION** for React I MVP purposes only* 

</details>

</details>

## User Requests
<details>
<summary> :arrow_down: </summary>

### GET REQs

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


**Find User By ID --** https://eschoolinthecloud.herokuapp.com/users/user/{id}    
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

**Find User By Username --** https://eschoolinthecloud.herokuapp.com/users/user/name/{username}    
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

**Find User By Username Containing (Similar) --** https://eschoolinthecloud.herokuapp.com/users/user/name/like/{string}    

Note: *Finds usernames containing the string*     
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

### POST REQs
*Sign up and/or Admin access only*

**Add New User --** https://eschoolinthecloud.herokuapp.com/users/user    
   
## USER TABLE

Name | Data Type (min, max)
------------ | -------------
Fname | String
Lname | String
**Username**| **String**
**Password** | **String**
**Email** | **Email**
Role | Role

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
     

Note: *Role ID's can be sent as numbers or strings [{1, "Admin"}, {2, "Student"}, {3, "Volunteer"}*

</details>

<details>
<summary>Postman Results</summary>     

**Location:** https://eschoolinthecloud.herokuapp.com/users/user/{id}    
*Status: 201 Created*

</details>

### PUT REQs
*Admin access only*

**Update User --** https://eschoolinthecloud.herokuapp.com/users/user/15    

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
<summary>Http Status</summary>    

*Status: 200 Okay*

</details>

### PATCH REQs
*Admin access only*

**Update User --** https://eschoolinthecloud.herokuapp.com/users/user/15    

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
<summary>Http Status</summary>    

*Status: 200 Okay*

</details>

### DELETE REqs
*Admin access only*

**Delete User By ID --** https://eschoolinthecloud.herokuapp.com/users/user/{id}    

<details>
<summary>https://eschoolinthecloud.herokuapp.com/users/user/15</summary>     

*Status: 200 Okay*

</details>

</details>


## Event Requests
<details>
<summary> :arrow_down: </summary>

### GET REQs  

**List All Events --** https://eschoolinthecloud.herokuapp.com/events/events   
Example Output:

<details> 
<summary>http://eschoolinthecloud.herokuapp.com/events/events</summary>

```JSON
[
    {
        "eventid": 31,
        "title": "First Event",
        "description": "Test Event",
        "length": 1.5,
        "lengthdesc": "One and a Half Hours",
        "category": {
            "categoryid": 25,
            "name": "Uncategorized"
        },
        "eventdates": [
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 2,
                    "timeimperial": 2,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 6,
                    "eventmonthname": "June",
                    "eventday": 24,
                    "eventyear": 2021,
                    "eventdateid": 16
                }
            },
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 11,
                    "timeimperial": 11,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 12,
                    "eventmonthname": "December",
                    "eventday": 14,
                    "eventyear": 2020,
                    "eventdateid": 19
                }
            }
        ]
    },
    {
        "eventid": 32,
        "title": "Second Event",
        "description": "Test Event",
        "length": 3.0,
        "lengthdesc": "Three Hours",
        "category": {
            "categoryid": 26,
            "name": "Tech"
        },
        "eventdates": [
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 2,
                    "timeimperial": 2,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 6,
                    "eventmonthname": "June",
                    "eventday": 24,
                    "eventyear": 2021,
                    "eventdateid": 16
                }
            },
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 11,
                    "timeimperial": 11,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 12,
                    "eventmonthname": "December",
                    "eventday": 14,
                    "eventyear": 2020,
                    "eventdateid": 19
                }
            },
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 19,
                    "timeimperial": 7,
                    "timeimperialsuffix": "PM",
                    "eventmonth": 11,
                    "eventmonthname": "November",
                    "eventday": 24,
                    "eventyear": 2020,
                    "eventdateid": 20
                }
            }
        ]
    },
    {
        "eventid": 33,
        "title": "Third Event",
        "description": "Test Event",
        "length": 0.5,
        "lengthdesc": "30 Minutes",
        "category": {
            "categoryid": 27,
            "name": "Science"
        },
        "eventdates": [
            {
                "datee": {
                    "timeminute": 30,
                    "timedigital": 24,
                    "timeimperial": 12,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 9,
                    "eventmonthname": "September",
                    "eventday": 30,
                    "eventyear": 2020,
                    "eventdateid": 21
                }
            },
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 1,
                    "timeimperial": 1,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 2,
                    "eventmonthname": "February",
                    "eventday": 28,
                    "eventyear": 2021,
                    "eventdateid": 23
                }
            }
        ]
    },
    {
        "eventid": 34,
        "title": "Fourth Event",
        "description": "Test Event",
        "length": 5.0,
        "lengthdesc": "Five Hours",
        "category": {
            "categoryid": 28,
            "name": "Literature"
        },
        "eventdates": []
    },
    {
        "eventid": 35,
        "title": "Fifth Event",
        "description": "Test Event",
        "length": 3.5,
        "lengthdesc": "Three and a Half Hours",
        "category": {
            "categoryid": 29,
            "name": "Gaming"
        },
        "eventdates": []
    },
    {
        "eventid": 36,
        "title": "Sixth Event",
        "description": "Test Event",
        "length": 2.5,
        "lengthdesc": "Two and a Half Hours",
        "category": {
            "categoryid": 30,
            "name": "Entertainment"
        },
        "eventdates": [
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 2,
                    "timeimperial": 2,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 6,
                    "eventmonthname": "June",
                    "eventday": 24,
                    "eventyear": 2021,
                    "eventdateid": 16
                }
            },
            {
                "datee": {
                    "timeminute": 30,
                    "timedigital": 20,
                    "timeimperial": 8,
                    "timeimperialsuffix": "PM",
                    "eventmonth": 12,
                    "eventmonthname": "December",
                    "eventday": 4,
                    "eventyear": 2020,
                    "eventdateid": 18
                }
            },
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 11,
                    "timeimperial": 11,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 12,
                    "eventmonthname": "December",
                    "eventday": 14,
                    "eventyear": 2020,
                    "eventdateid": 19
                }
            },
            {
                "datee": {
                    "timeminute": 30,
                    "timedigital": 24,
                    "timeimperial": 12,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 9,
                    "eventmonthname": "September",
                    "eventday": 30,
                    "eventyear": 2020,
                    "eventdateid": 21
                }
            }
        ]
    }
]
```

</details>

**Find Event By Title --** http://eschoolinthecloud.herokuapp.com/events/event/name/{title}   
Example Output:

<details>
<summary>http://eschoolinthecloud.herokuapp.com/events/event/name/Second</summary>

```JSON
{
    "eventid": 32,
    "title": "Second",
    "description": "Test Event",
    "length": 3.0,
    "lengthdesc": "Three Hours",
    "category": {
        "categoryid": 26,
        "name": "Tech"
    },
    "eventdates": [
        {
            "datee": {
                "timeminute": 0,
                "timedigital": 2,
                "timeimperial": 2,
                "timeimperialsuffix": "AM",
                "eventmonth": 6,
                "eventmonthname": "June",
                "eventday": 24,
                "eventyear": 2021,
                "eventdateid": 16
            }
        },
        {
            "datee": {
                "timeminute": 0,
                "timedigital": 19,
                "timeimperial": 7,
                "timeimperialsuffix": "PM",
                "eventmonth": 11,
                "eventmonthname": "November",
                "eventday": 24,
                "eventyear": 2020,
                "eventdateid": 20
            }
        },
        {
            "datee": {
                "timeminute": 0,
                "timedigital": 11,
                "timeimperial": 11,
                "timeimperialsuffix": "AM",
                "eventmonth": 12,
                "eventmonthname": "December",
                "eventday": 14,
                "eventyear": 2020,
                "eventdateid": 19
            }
        }
    ]
}
```
</details>

**List All Events --** https://eschoolinthecloud.herokuapp.com/events/events    
Example Output:

<details> 
<summary>http://eschoolinthecloud.herokuapp.com/events/events</summary>

```JSON
[
    {
        "eventid": 31,
        "title": "First",
        "description": "Test Event",
        "length": 1.5,
        "lengthdesc": "One and a Half Hours",
        "category": {
            "categoryid": 25,
            "name": "Uncategorized"
        },
        "eventdates": [
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 2,
                    "timeimperial": 2,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 6,
                    "eventmonthname": "June",
                    "eventday": 24,
                    "eventyear": 2021,
                    "eventdateid": 16
                }
            },
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 11,
                    "timeimperial": 11,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 12,
                    "eventmonthname": "December",
                    "eventday": 14,
                    "eventyear": 2020,
                    "eventdateid": 19
                }
            }
        ]
    },
    {
        "eventid": 32,
        "title": "Second",
        "description": "Test Event",
        "length": 3.0,
        "lengthdesc": "Three Hours",
        "category": {
            "categoryid": 26,
            "name": "Tech"
        },
        "eventdates": [
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 2,
                    "timeimperial": 2,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 6,
                    "eventmonthname": "June",
                    "eventday": 24,
                    "eventyear": 2021,
                    "eventdateid": 16
                }
            },
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 19,
                    "timeimperial": 7,
                    "timeimperialsuffix": "PM",
                    "eventmonth": 11,
                    "eventmonthname": "November",
                    "eventday": 24,
                    "eventyear": 2020,
                    "eventdateid": 20
                }
            },
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 11,
                    "timeimperial": 11,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 12,
                    "eventmonthname": "December",
                    "eventday": 14,
                    "eventyear": 2020,
                    "eventdateid": 19
                }
            }
        ]
    },
    {
        "eventid": 33,
        "title": "Third",
        "description": "Test Event",
        "length": 0.5,
        "lengthdesc": "30 Minutes",
        "category": {
            "categoryid": 27,
            "name": "Science"
        },
        "eventdates": [
            {
                "datee": {
                    "timeminute": 30,
                    "timedigital": 24,
                    "timeimperial": 12,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 9,
                    "eventmonthname": "September",
                    "eventday": 30,
                    "eventyear": 2020,
                    "eventdateid": 21
                }
            },
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 1,
                    "timeimperial": 1,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 2,
                    "eventmonthname": "February",
                    "eventday": 28,
                    "eventyear": 2021,
                    "eventdateid": 23
                }
            }
        ]
    },
    {
        "eventid": 34,
        "title": "Fourth",
        "description": "Test Event",
        "length": 5.0,
        "lengthdesc": "Five Hours",
        "category": {
            "categoryid": 28,
            "name": "Literature"
        },
        "eventdates": []
    },
    {
        "eventid": 35,
        "title": "Fifth",
        "description": "Test Event",
        "length": 3.5,
        "lengthdesc": "Three and a Half Hours",
        "category": {
            "categoryid": 29,
            "name": "Gaming"
        },
        "eventdates": []
    },
    {
        "eventid": 36,
        "title": "Sixth Event",
        "description": "Test Event",
        "length": 2.5,
        "lengthdesc": "Two and a Half Hours",
        "category": {
            "categoryid": 30,
            "name": "Entertainment"
        },
        "eventdates": [
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 2,
                    "timeimperial": 2,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 6,
                    "eventmonthname": "June",
                    "eventday": 24,
                    "eventyear": 2021,
                    "eventdateid": 16
                }
            },
            {
                "datee": {
                    "timeminute": 30,
                    "timedigital": 20,
                    "timeimperial": 8,
                    "timeimperialsuffix": "PM",
                    "eventmonth": 12,
                    "eventmonthname": "December",
                    "eventday": 4,
                    "eventyear": 2020,
                    "eventdateid": 18
                }
            },
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 11,
                    "timeimperial": 11,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 12,
                    "eventmonthname": "December",
                    "eventday": 14,
                    "eventyear": 2020,
                    "eventdateid": 19
                }
            },
            {
                "datee": {
                    "timeminute": 30,
                    "timedigital": 24,
                    "timeimperial": 12,
                    "timeimperialsuffix": "AM",
                    "eventmonth": 9,
                    "eventmonthname": "September",
                    "eventday": 30,
                    "eventyear": 2020,
                    "eventdateid": 21
                }
            }
        ]
    }
]
```

</details>

**List All Events By Categories --** http://eschoolinthecloud.herokuapp.com/events/categories   
Example Output:

<details>
<summary>http://eschoolinthecloud.herokuapp.com/events/categories</summary>

```JSON
[
    {
        "categoryid": 25,
        "name": "Uncategorized",
        "events": [
            {
                "eventid": 32,
                "title": "Second",
                "description": "Test Event",
                "lengthchange": false,
                "length": 3.0,
                "lengthdesc": "Three Hours",
                "eventdates": [
                    {
                        "datee": {
                            "timeminute": 0,
                            "timedigital": 2,
                            "timeimperial": 2,
                            "timeimperialsuffix": "AM",
                            "eventmonth": 6,
                            "eventmonthname": "June",
                            "eventday": 24,
                            "eventyear": 2021,
                            "eventdateid": 16
                        }
                    },
                    {
                        "datee": {
                            "timeminute": 0,
                            "timedigital": 19,
                            "timeimperial": 7,
                            "timeimperialsuffix": "PM",
                            "eventmonth": 11,
                            "eventmonthname": "November",
                            "eventday": 24,
                            "eventyear": 2020,
                            "eventdateid": 20
                        }
                    },
                    {
                        "datee": {
                            "timeminute": 0,
                            "timedigital": 11,
                            "timeimperial": 11,
                            "timeimperialsuffix": "AM",
                            "eventmonth": 12,
                            "eventmonthname": "December",
                            "eventday": 14,
                            "eventyear": 2020,
                            "eventdateid": 19
                        }
                    }
                ]
            },
            {
                "eventid": 31,
                "title": "First",
                "description": "Test Event",
                "lengthchange": false,
                "length": 1.5,
                "lengthdesc": "One and a Half Hours",
                "eventdates": [
                    {
                        "datee": {
                            "timeminute": 0,
                            "timedigital": 2,
                            "timeimperial": 2,
                            "timeimperialsuffix": "AM",
                            "eventmonth": 6,
                            "eventmonthname": "June",
                            "eventday": 24,
                            "eventyear": 2021,
                            "eventdateid": 16
                        }
                    },
                    {
                        "datee": {
                            "timeminute": 0,
                            "timedigital": 11,
                            "timeimperial": 11,
                            "timeimperialsuffix": "AM",
                            "eventmonth": 12,
                            "eventmonthname": "December",
                            "eventday": 14,
                            "eventyear": 2020,
                            "eventdateid": 19
                        }
                    }
                ]
            },
            {
                "eventid": 33,
                "title": "Third",
                "description": "Test Event",
                "lengthchange": false,
                "length": 0.5,
                "lengthdesc": "30 Minutes",
                "eventdates": [
                    {
                        "datee": {
                            "timeminute": 30,
                            "timedigital": 24,
                            "timeimperial": 12,
                            "timeimperialsuffix": "AM",
                            "eventmonth": 9,
                            "eventmonthname": "September",
                            "eventday": 30,
                            "eventyear": 2020,
                            "eventdateid": 21
                        }
                    },
                    {
                        "datee": {
                            "timeminute": 0,
                            "timedigital": 1,
                            "timeimperial": 1,
                            "timeimperialsuffix": "AM",
                            "eventmonth": 2,
                            "eventmonthname": "February",
                            "eventday": 28,
                            "eventyear": 2021,
                            "eventdateid": 23
                        }
                    }
                ]
            }
        ]
    },
    {
        "categoryid": 26,
        "name": "Tech",
        "events": []
    },
    {
        "categoryid": 27,
        "name": "Science",
        "events": []
    },
    {
        "categoryid": 28,
        "name": "Literature",
        "events": [
            {
                "eventid": 34,
                "title": "Fourth",
                "description": "Test Event",
                "lengthchange": false,
                "length": 5.0,
                "lengthdesc": "Five Hours",
                "eventdates": []
            }
        ]
    },
    {
        "categoryid": 29,
        "name": "Gaming",
        "events": [
            {
                "eventid": 35,
                "title": "Fifth",
                "description": "Test Event",
                "lengthchange": false,
                "length": 3.5,
                "lengthdesc": "Three and a Half Hours",
                "eventdates": []
            }
        ]
    },
    {
        "categoryid": 30,
        "name": "Entertainment",
        "events": [
            {
                "eventid": 36,
                "title": "Sixth Event",
                "description": "Test Event",
                "lengthchange": false,
                "length": 2.5,
                "lengthdesc": "Two and a Half Hours",
                "eventdates": [
                    {
                        "datee": {
                            "timeminute": 0,
                            "timedigital": 2,
                            "timeimperial": 2,
                            "timeimperialsuffix": "AM",
                            "eventmonth": 6,
                            "eventmonthname": "June",
                            "eventday": 24,
                            "eventyear": 2021,
                            "eventdateid": 16
                        }
                    },
                    {
                        "datee": {
                            "timeminute": 30,
                            "timedigital": 20,
                            "timeimperial": 8,
                            "timeimperialsuffix": "PM",
                            "eventmonth": 12,
                            "eventmonthname": "December",
                            "eventday": 4,
                            "eventyear": 2020,
                            "eventdateid": 18
                        }
                    },
                    {
                        "datee": {
                            "timeminute": 0,
                            "timedigital": 11,
                            "timeimperial": 11,
                            "timeimperialsuffix": "AM",
                            "eventmonth": 12,
                            "eventmonthname": "December",
                            "eventday": 14,
                            "eventyear": 2020,
                            "eventdateid": 19
                        }
                    },
                    {
                        "datee": {
                            "timeminute": 30,
                            "timedigital": 24,
                            "timeimperial": 12,
                            "timeimperialsuffix": "AM",
                            "eventmonth": 9,
                            "eventmonthname": "September",
                            "eventday": 30,
                            "eventyear": 2020,
                            "eventdateid": 21
                        }
                    }
                ]
            }
        ]
    }
]
```
</details>

**List Events By Category By ID --** http://eschoolinthecloud.herokuapp.com/events/category/id/{categoryid}   
Example Output:

<details>
<summary>http://eschoolinthecloud.herokuapp.com/events/category/id/25</summary>

```JSON
{
    "categoryid": 25,
    "name": "Uncategorized",
    "events": [
        {
            "eventid": 32,
            "title": "Second",
            "description": "Test Event",
            "lengthchange": false,
            "length": 3.0,
            "lengthdesc": "Three Hours"
        },
        {
            "eventid": 31,
            "title": "First",
            "description": "Test Event",
            "lengthchange": false,
            "length": 1.5,
            "lengthdesc": "One and a Half Hours"
        },
        {
            "eventid": 33,
            "title": "Third",
            "description": "Test Event",
            "lengthchange": false,
            "length": 0.5,
            "lengthdesc": "30 Minutes"
        }
    ]
}
```
</details>

**Find Event Category By Name --** http://eschoolinthecloud.herokuapp.com/events/category/name/{categoryname}   
Example Output:

<details>
<summary>http://eschoolinthecloud.herokuapp.com/events/category/id/tech</summary>

```JSON
{
    "categoryid": 26,
    "name": "Tech"
}
```
</details>

### POST REQs

**Add A New Event --** http://eschoolinthecloud.herokuapp.com/events/event
   

## EVENT TABLE

Name | Data Type (min, max)
------------ | -------------
Title | String
Description | String
**Username**| **String**
**Password** | **String**
**Email** | **Email**
Length | double
Length Description | String
Category | Category
Event Dates | Set<EventDates>   


## DATE TABLE

Name | Data Type (min, max)
------------ | -------------
**Minutes**| **int (0, 59)**
**Hours** | **int (0, 24)**
Hours (Analog Clock) | int (1, 12)
AM / PM | String
**Month** | **int (1, 12)**
Month Name | String
**Day** | **int (1, 31)**
**Year** | **int**
Events | Set<EventDates>


## CATEGORY TABLE
   
Name | Data Type (min, max)
------------ | -------------
**Name**| **String**
[ Events ] | Set<EventDates>
  

<details>
<summary>Minimum Body</summary>

```JSON
{
    "title": "Hundred Event",
    "description": "Adding a Test Event",
    "length": 2.0
}
```

</details>

<details>
<summary>Postman Results</summary>    

Location: http://eschoolinthecloud.herokuapp.com/events/event/38
*Status: 200 Okay*

</details>   

**Add A New Event Category --** http://eschoolinthecloud.herokuapp.com/events/category

<details>
<summary>Minimum Body</summary>

```JSON
{
    "name": "New Category"
}
```
</details>

<details>
<summary>Postman Results</summary>

Location: http://eschoolinthecloud.herokuapp.com/events/category/39
*Status: 201 Created*

</details>

### PATCH REQs

**Update Event By ID --** http://eschoolinthecloud.herokuapp.com/events/event/{eventid}

<details>
<summary>Minimum Body</summary>

```JSON
{
    "title": "Hundred Event",
    "description": "Updating Test Event",
    "length": 2.0
}
```
</details>

<details>
<summary>Postman Results</summary>    

Location: http://eschoolinthecloud.herokuapp.com/events/event/38
*Status: 200 Okay*

</details>

### Delete REQs

**Delete Event By ID --** http://eschoolinthecloud.herokuapp.com/events/event/   

<details>
<summary>http://eschoolinthecloud.herokuapp.com/events/event/38</summary>

*Status: 200 Okay*

</details>









</details>