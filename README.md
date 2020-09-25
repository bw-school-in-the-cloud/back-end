# School In The Cloud 

### API URL 
https://eschoolinthecloud.herokuapp.com/   
   

![Step One](https://github.com/bw-school-in-the-cloud/back-end/blob/master/PostmanFlow1.png?raw=true)
   
![Step Two](https://github.com/bw-school-in-the-cloud/back-end/blob/master/PostmanFlow2.png?raw=true)
   
![Step Three](https://github.com/bw-school-in-the-cloud/back-end/blob/master/PostmanFlow3.png?raw=true)
   
![Step Four](https://github.com/bw-school-in-the-cloud/back-end/blob/master/PostmanFlow4.png?raw=true)

## Signing Up A New User

### POST
https://eschoolinthecloud.herokuapp.com/createnewuser

Required Fields in **BOLD**   

## USER TABLE

Name | Data Type (min, max)
------------ | -------------
**Username**| **String**
**Password** | **String**
**Primaryemail** | **Email**   
   
**Role Type will default to Volunteer**   
Role Type can be set with nested Role ID or Role Type Name in String Format

```JSON
{
    "fname": "Doc",
    "lname": "Example",
    "username": "docExampleRole",
    "primaryemail": "docNews@lambdaschool.local",
    "password": "password",
    "roles": [
        {
            "role": {
                "roleid": 1
            }
        },
        {
            "role": {
                "name": "STUDENT"
            }
        }
    ]
}
```   
   
   
## Terms Of Service Requests
<details>
<summary> :arrow_down: </summary>

### GET REQs
Note: *Data for React I MVP Only*   


:arrow_forward: **List Terms Of Service --** http://eschoolinthecloud.herokuapp.com/terms/terms   
Example Output:

<details> 
<summary>http://eschoolinthecloud.herokuapp.com/terms/terms</summary>

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

:arrow_forward: **List All Users --** https://eschoolinthecloud.herokuapp.com/users/users   
Example Output:

<details>
<summary>https://eschoolinthecloud.herokuapp.com/users/users</summary>

```JSON
[
    {
        "userid": 4,
        "fname": "Guest",
        "lname": "1410",
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
        "hostedby": [],
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
        ],
        "events": []
    },
    {
        "userid": 7,
        "fname": "Guest",
        "lname": "2714",
        "username": "student",
        "primaryemail": "student@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 8,
                "useremail": "student@mymail.local"
            }
        ],
        "hostedby": [],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "STUDENT"
                }
            }
        ],
        "events": []
    },
    {
        "userid": 9,
        "fname": "Guest",
        "lname": "482",
        "username": "volunteer",
        "primaryemail": "volunteer@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 10,
                "useremail": "volunteer@email.local"
            }
        ],
        "hostedby": [],
        "roles": [
            {
                "role": {
                    "roleid": 3,
                    "name": "VOLUNTEER"
                }
            }
        ],
        "events": []
    },
    {
        "userid": 37,
        "fname": "Zach",
        "lname": "Zach",
        "username": "zach",
        "primaryemail": "zach@z.c",
        "useremails": [],
        "hostedby": [
            {
                "event": {
                    "eventid": 31,
                    "title": "First",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 1.5,
                    "lengthdesc": "One and a Half Hours",
                    "category": {
                        "categoryid": 25,
                        "name": "Uncategorized"
                    }
                },
                "datee": {
                    "timeminute": 30,
                    "timedigital": 18,
                    "timeimperial": 6,
                    "timeimperialsuffix": "PM",
                    "timezone": "PDT",
                    "eventmonth": 10,
                    "eventmonthname": "October",
                    "eventday": 24,
                    "eventyear": 2020,
                    "display": "6:30 PM October 24, 2020",
                    "displaytime": "6:30 PM",
                    "eventdateid": 17
                },
                "eventinfo": null,
                "eventdateday": null,
                "duration": 0.0
            }
        ],
        "roles": [],
        "events": [
            {
                "event": {
                    "eventid": 31,
                    "title": "First",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 1.5,
                    "lengthdesc": "One and a Half Hours",
                    "category": {
                        "categoryid": 25,
                        "name": "Uncategorized"
                    }
                },
                "user": {
                    "userid": 37,
                    "fname": "Zach",
                    "lname": "Zach",
                    "username": "zach",
                    "primaryemail": "zach@z.c",
                    "useremails": [],
                    "hostedby": [
                        {
                            "event": {
                                "eventid": 31,
                                "title": "First",
                                "description": "Test Event",
                                "lengthchange": false,
                                "length": 1.5,
                                "lengthdesc": "One and a Half Hours",
                                "category": {
                                    "categoryid": 25,
                                    "name": "Uncategorized"
                                }
                            },
                            "datee": {
                                "timeminute": 30,
                                "timedigital": 18,
                                "timeimperial": 6,
                                "timeimperialsuffix": "PM",
                                "timezone": "PDT",
                                "eventmonth": 10,
                                "eventmonthname": "October",
                                "eventday": 24,
                                "eventyear": 2020,
                                "display": "6:30 PM October 24, 2020",
                                "displaytime": "6:30 PM",
                                "eventdateid": 17
                            },
                            "eventinfo": null,
                            "eventdateday": null,
                            "duration": 0.0
                        }
                    ],
                    "roles": []
                }
            }
        ]
    },
    {
        "userid": 38,
        "fname": "Guest",
        "lname": "1512",
        "username": "testone",
        "primaryemail": "test1@z.c",
        "useremails": [],
        "hostedby": [],
        "roles": [],
        "events": [
            {
                "event": {
                    "eventid": 31,
                    "title": "First",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 1.5,
                    "lengthdesc": "One and a Half Hours",
                    "category": {
                        "categoryid": 25,
                        "name": "Uncategorized"
                    }
                },
                "user": {
                    "userid": 38,
                    "fname": "Guest",
                    "lname": "1512",
                    "username": "testone",
                    "primaryemail": "test1@z.c",
                    "useremails": [],
                    "hostedby": [],
                    "roles": []
                }
            }
        ]
    },
    {
        "userid": 39,
        "fname": "Guest",
        "lname": "4232",
        "username": "testtwo",
        "primaryemail": "test2@z.c",
        "useremails": [],
        "hostedby": [],
        "roles": [],
        "events": [
            {
                "event": {
                    "eventid": 33,
                    "title": "Third",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 0.5,
                    "lengthdesc": "30 Minutes",
                    "category": {
                        "categoryid": 25,
                        "name": "Uncategorized"
                    }
                },
                "user": {
                    "userid": 39,
                    "fname": "Guest",
                    "lname": "4232",
                    "username": "testtwo",
                    "primaryemail": "test2@z.c",
                    "useremails": [],
                    "hostedby": [],
                    "roles": []
                }
            }
        ]
    },
    {
        "userid": 40,
        "fname": "Guest",
        "lname": "4124",
        "username": "testthree",
        "primaryemail": "test3@z.c",
        "useremails": [],
        "hostedby": [],
        "roles": [],
        "events": [
            {
                "event": {
                    "eventid": 34,
                    "title": "Fourth",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 5.0,
                    "lengthdesc": "Five Hours",
                    "category": {
                        "categoryid": 28,
                        "name": "Literature"
                    }
                },
                "user": {
                    "userid": 40,
                    "fname": "Guest",
                    "lname": "4124",
                    "username": "testthree",
                    "primaryemail": "test3@z.c",
                    "useremails": [],
                    "hostedby": [],
                    "roles": []
                }
            }
        ]
    },
    {
        "userid": 41,
        "fname": "Guest",
        "lname": "3529",
        "username": "testfour",
        "primaryemail": "test4@z.c",
        "useremails": [],
        "hostedby": [],
        "roles": [],
        "events": [
            {
                "event": {
                    "eventid": 31,
                    "title": "First",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 1.5,
                    "lengthdesc": "One and a Half Hours",
                    "category": {
                        "categoryid": 25,
                        "name": "Uncategorized"
                    }
                },
                "user": {
                    "userid": 41,
                    "fname": "Guest",
                    "lname": "3529",
                    "username": "testfour",
                    "primaryemail": "test4@z.c",
                    "useremails": [],
                    "hostedby": [],
                    "roles": []
                }
            }
        ]
    }
]
```
</details>


:arrow_forward: **Find Current User --** https://eschoolinthecloud.herokuapp.com/users/getuserinfo   
Examle Output:   

<details>
<summary>https://eschoolinthecloud.herokuapp.com/users/getuserinfo</summary>

```JSON
{
    "userid": 4,
    "fname": "Guest",
    "lname": "888",
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
    "eventdates": [],
    "events": [],
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

:arrow_forward: **Find User By ID --** https://eschoolinthecloud.herokuapp.com/users/user/{id}    
Example Output: 

<details>
<summary>https://eschoolinthecloud.herokuapp.com/users/user/4</summary>

```JSON
{
    "userid": 4,
    "fname": "Guest",
    "lname": "1410",
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
    "hostedby": [],
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
    ],
    "events": []
}
```
</details>

:arrow_forward: **Find User By Username --** https://eschoolinthecloud.herokuapp.com/users/user/name/{username}    
Example Output:

<details>
<summary>https://eschoolinthecloud.herokuapp.com/users/user/name/admin</summary>

```JSON
{
    "userid": 4,
    "fname": "Guest",
    "lname": "1410",
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
    "hostedby": [],
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
    ],
    "events": []
}
```
</details>

:arrow_forward: **Find User By Username Containing (Similar) --** https://eschoolinthecloud.herokuapp.com/users/user/name/like/{string}    

Note: *Finds usernames containing the string*     
Example Output: 

<details>
<summary>https://eschoolinthecloud.herokuapp.com/users/user/name/like/vol</summary>

```JSON
[
    {
        "userid": 9,
        "fname": "Guest",
        "lname": "482",
        "username": "volunteer",
        "primaryemail": "volunteer@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 10,
                "useremail": "volunteer@email.local"
            }
        ],
        "hostedby": [],
        "roles": [
            {
                "role": {
                    "roleid": 3,
                    "name": "VOLUNTEER"
                }
            }
        ],
        "events": []
    }
]
```
</details>

### POST REQs
*Sign up and/or Admin access only*

:arrow_forward: **Add New User --** https://eschoolinthecloud.herokuapp.com/users/user    
   
## USER TABLE

Name | Data Type (min, max)
------------ | -------------
Fname | String
Lname | String
**Username**| **String**
**Password** | **String**
**Primaryemail** | **Email**
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

:arrow_forward: **Update User --** https://eschoolinthecloud.herokuapp.com/users/user/15    

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

:arrow_forward: **Update User --** https://eschoolinthecloud.herokuapp.com/users/user/15    

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

:arrow_forward: **Delete User By ID --** https://eschoolinthecloud.herokuapp.com/users/user/{id}    

<details>
<summary>https://eschoolinthecloud.herokuapp.com/users/user/15</summary>     

*Status: 200 Okay*

</details>

</details>


## Event Requests
<details>
<summary> :arrow_down: </summary>

### GET REQs  

:arrow_forward: **List All Events --** https://eschoolinthecloud.herokuapp.com/events/events   
Example Output:

<details> 
<summary>https://eschoolinthecloud.herokuapp.com/events/events</summary>

```JSON
[
    {
        "eventid": 31,
        "title": "First",
        "description": "Test Event",
        "lengthchange": false,
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
                    "timezone": "PDT",
                    "eventmonth": 6,
                    "eventmonthname": "June",
                    "eventday": 24,
                    "eventyear": 2021,
                    "display": "2:00 AM June 24, 2021",
                    "displaytime": "2:00 AM",
                    "eventdateid": 16
                },
                "eventinfo": "Uncategorized: Test Event 2:00 AM June 24, 2021",
                "eventdateday": "June 24",
                "duration": 1.5,
                "user": null
            },
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 11,
                    "timeimperial": 11,
                    "timeimperialsuffix": "AM",
                    "timezone": "PDT",
                    "eventmonth": 12,
                    "eventmonthname": "December",
                    "eventday": 14,
                    "eventyear": 2020,
                    "display": "11:00 AM December 14, 2020",
                    "displaytime": "11:00 AM",
                    "eventdateid": 19
                },
                "eventinfo": "Uncategorized: Test Event 11:00 AM December 14, 2020",
                "eventdateday": "December 14",
                "duration": 1.5,
                "user": null
            },
            {
                "datee": {
                    "timeminute": 30,
                    "timedigital": 18,
                    "timeimperial": 6,
                    "timeimperialsuffix": "PM",
                    "timezone": "PDT",
                    "eventmonth": 10,
                    "eventmonthname": "October",
                    "eventday": 24,
                    "eventyear": 2020,
                    "display": "6:30 PM October 24, 2020",
                    "displaytime": "6:30 PM",
                    "eventdateid": 17
                },
                "eventinfo": null,
                "eventdateday": null,
                "duration": 0.0,
                "user": {
                    "userid": 37,
                    "fname": "Zach",
                    "lname": "Zach",
                    "username": "zach",
                    "primaryemail": "zach@z.c",
                    "useremails": [],
                    "hostedby": [
                        {
                            "event": {
                                "eventid": 31,
                                "title": "First",
                                "description": "Test Event",
                                "lengthchange": false,
                                "length": 1.5,
                                "lengthdesc": "One and a Half Hours",
                                "category": {
                                    "categoryid": 25,
                                    "name": "Uncategorized"
                                }
                            },
                            "datee": {
                                "timeminute": 30,
                                "timedigital": 18,
                                "timeimperial": 6,
                                "timeimperialsuffix": "PM",
                                "timezone": "PDT",
                                "eventmonth": 10,
                                "eventmonthname": "October",
                                "eventday": 24,
                                "eventyear": 2020,
                                "display": "6:30 PM October 24, 2020",
                                "displaytime": "6:30 PM",
                                "eventdateid": 17
                            },
                            "eventinfo": null,
                            "eventdateday": null,
                            "duration": 0.0
                        }
                    ],
                    "roles": [],
                    "events": [
                        {
                            "event": {
                                "eventid": 31,
                                "title": "First",
                                "description": "Test Event",
                                "lengthchange": false,
                                "length": 1.5,
                                "lengthdesc": "One and a Half Hours",
                                "category": {
                                    "categoryid": 25,
                                    "name": "Uncategorized"
                                }
                            },
                            "user": {
                                "userid": 37,
                                "fname": "Zach",
                                "lname": "Zach",
                                "username": "zach",
                                "primaryemail": "zach@z.c",
                                "useremails": [],
                                "hostedby": [
                                    {
                                        "event": {
                                            "eventid": 31,
                                            "title": "First",
                                            "description": "Test Event",
                                            "lengthchange": false,
                                            "length": 1.5,
                                            "lengthdesc": "One and a Half Hours",
                                            "category": {
                                                "categoryid": 25,
                                                "name": "Uncategorized"
                                            }
                                        },
                                        "datee": {
                                            "timeminute": 30,
                                            "timedigital": 18,
                                            "timeimperial": 6,
                                            "timeimperialsuffix": "PM",
                                            "timezone": "PDT",
                                            "eventmonth": 10,
                                            "eventmonthname": "October",
                                            "eventday": 24,
                                            "eventyear": 2020,
                                            "display": "6:30 PM October 24, 2020",
                                            "displaytime": "6:30 PM",
                                            "eventdateid": 17
                                        },
                                        "eventinfo": null,
                                        "eventdateday": null,
                                        "duration": 0.0
                                    }
                                ],
                                "roles": []
                            }
                        }
                    ]
                }
            }
        ]
    },
    {
        "eventid": 32,
        "title": "Second",
        "description": "Test Event",
        "lengthchange": false,
        "length": 3.0,
        "lengthdesc": "Three Hours",
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
                    "timezone": "PDT",
                    "eventmonth": 6,
                    "eventmonthname": "June",
                    "eventday": 24,
                    "eventyear": 2021,
                    "display": "2:00 AM June 24, 2021",
                    "displaytime": "2:00 AM",
                    "eventdateid": 16
                },
                "eventinfo": "Uncategorized: Test Event 2:00 AM June 24, 2021",
                "eventdateday": "June 24",
                "duration": 3.0,
                "user": null
            },
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 19,
                    "timeimperial": 7,
                    "timeimperialsuffix": "PM",
                    "timezone": "PDT",
                    "eventmonth": 11,
                    "eventmonthname": "November",
                    "eventday": 24,
                    "eventyear": 2020,
                    "display": "7:00 PM November 24, 2020",
                    "displaytime": "7:00 PM",
                    "eventdateid": 20
                },
                "eventinfo": "Uncategorized: Test Event 7:00 PM November 24, 2020",
                "eventdateday": "November 24",
                "duration": 3.0,
                "user": null
            },
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 11,
                    "timeimperial": 11,
                    "timeimperialsuffix": "AM",
                    "timezone": "PDT",
                    "eventmonth": 12,
                    "eventmonthname": "December",
                    "eventday": 14,
                    "eventyear": 2020,
                    "display": "11:00 AM December 14, 2020",
                    "displaytime": "11:00 AM",
                    "eventdateid": 19
                },
                "eventinfo": "Uncategorized: Test Event 11:00 AM December 14, 2020",
                "eventdateday": "December 14",
                "duration": 3.0,
                "user": null
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
        "category": {
            "categoryid": 25,
            "name": "Uncategorized"
        },
        "eventdates": [
            {
                "datee": {
                    "timeminute": 30,
                    "timedigital": 24,
                    "timeimperial": 12,
                    "timeimperialsuffix": "AM",
                    "timezone": "PDT",
                    "eventmonth": 9,
                    "eventmonthname": "September",
                    "eventday": 30,
                    "eventyear": 2020,
                    "display": "12:30 AM September 30, 2020",
                    "displaytime": "12:30 AM",
                    "eventdateid": 21
                },
                "eventinfo": "Uncategorized: Test Event 12:30 AM September 30, 2020",
                "eventdateday": "September 30",
                "duration": 0.5,
                "user": null
            },
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 1,
                    "timeimperial": 1,
                    "timeimperialsuffix": "AM",
                    "timezone": "PDT",
                    "eventmonth": 2,
                    "eventmonthname": "February",
                    "eventday": 28,
                    "eventyear": 2021,
                    "display": "1:00 AM February 28, 2021",
                    "displaytime": "1:00 AM",
                    "eventdateid": 23
                },
                "eventinfo": "Uncategorized: Test Event 1:00 AM February 28, 2021",
                "eventdateday": "February 28",
                "duration": 0.5,
                "user": null
            }
        ]
    },
    {
        "eventid": 34,
        "title": "Fourth",
        "description": "Test Event",
        "lengthchange": false,
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
        "lengthchange": false,
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
        "lengthchange": false,
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
                    "timezone": "PDT",
                    "eventmonth": 6,
                    "eventmonthname": "June",
                    "eventday": 24,
                    "eventyear": 2021,
                    "display": "2:00 AM June 24, 2021",
                    "displaytime": "2:00 AM",
                    "eventdateid": 16
                },
                "eventinfo": "Entertainment: Test Event 2:00 AM June 24, 2021",
                "eventdateday": "June 24",
                "duration": 2.5,
                "user": null
            },
            {
                "datee": {
                    "timeminute": 30,
                    "timedigital": 20,
                    "timeimperial": 8,
                    "timeimperialsuffix": "PM",
                    "timezone": "PDT",
                    "eventmonth": 12,
                    "eventmonthname": "December",
                    "eventday": 4,
                    "eventyear": 2020,
                    "display": "8:30 PM December 4, 2020",
                    "displaytime": "8:30 PM",
                    "eventdateid": 18
                },
                "eventinfo": "Entertainment: Test Event 8:30 PM December 4, 2020",
                "eventdateday": "December 4",
                "duration": 2.5,
                "user": null
            },
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 11,
                    "timeimperial": 11,
                    "timeimperialsuffix": "AM",
                    "timezone": "PDT",
                    "eventmonth": 12,
                    "eventmonthname": "December",
                    "eventday": 14,
                    "eventyear": 2020,
                    "display": "11:00 AM December 14, 2020",
                    "displaytime": "11:00 AM",
                    "eventdateid": 19
                },
                "eventinfo": "Entertainment: Test Event 11:00 AM December 14, 2020",
                "eventdateday": "December 14",
                "duration": 2.5,
                "user": null
            },
            {
                "datee": {
                    "timeminute": 30,
                    "timedigital": 24,
                    "timeimperial": 12,
                    "timeimperialsuffix": "AM",
                    "timezone": "PDT",
                    "eventmonth": 9,
                    "eventmonthname": "September",
                    "eventday": 30,
                    "eventyear": 2020,
                    "display": "12:30 AM September 30, 2020",
                    "displaytime": "12:30 AM",
                    "eventdateid": 21
                },
                "eventinfo": "Entertainment: Test Event 12:30 AM September 30, 2020",
                "eventdateday": "September 30",
                "duration": 2.5,
                "user": null
            },
            {
                "datee": {
                    "timeminute": 30,
                    "timedigital": 18,
                    "timeimperial": 6,
                    "timeimperialsuffix": "PM",
                    "timezone": "PDT",
                    "eventmonth": 10,
                    "eventmonthname": "October",
                    "eventday": 24,
                    "eventyear": 2020,
                    "display": "6:30 PM October 24, 2020",
                    "displaytime": "6:30 PM",
                    "eventdateid": 17
                },
                "eventinfo": "Entertainment: Test Event 6:30 PM October 24, 2020",
                "eventdateday": "October 24",
                "duration": 2.5,
                "user": null
            }
        ]
    }
]
```

</details>

:arrow_forward: **Find Event By Title --** https://eschoolinthecloud.herokuapp.com/events/event/name/{title}   
Example Output:

<details>
<summary>https://eschoolinthecloud.herokuapp.com/events/event/name/Second</summary>

```JSON
{
    "eventid": 32,
    "title": "Second",
    "description": "Test Event",
    "lengthchange": false,
    "length": 3.0,
    "lengthdesc": "Three Hours",
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
                "timezone": "PDT",
                "eventmonth": 6,
                "eventmonthname": "June",
                "eventday": 24,
                "eventyear": 2021,
                "display": "2:00 AM June 24, 2021",
                "displaytime": "2:00 AM",
                "eventdateid": 16
            },
            "eventinfo": "Uncategorized: Test Event 2:00 AM June 24, 2021",
            "eventdateday": "June 24",
            "duration": 3.0,
            "user": null
        },
        {
            "datee": {
                "timeminute": 0,
                "timedigital": 19,
                "timeimperial": 7,
                "timeimperialsuffix": "PM",
                "timezone": "PDT",
                "eventmonth": 11,
                "eventmonthname": "November",
                "eventday": 24,
                "eventyear": 2020,
                "display": "7:00 PM November 24, 2020",
                "displaytime": "7:00 PM",
                "eventdateid": 20
            },
            "eventinfo": "Uncategorized: Test Event 7:00 PM November 24, 2020",
            "eventdateday": "November 24",
            "duration": 3.0,
            "user": null
        },
        {
            "datee": {
                "timeminute": 0,
                "timedigital": 11,
                "timeimperial": 11,
                "timeimperialsuffix": "AM",
                "timezone": "PDT",
                "eventmonth": 12,
                "eventmonthname": "December",
                "eventday": 14,
                "eventyear": 2020,
                "display": "11:00 AM December 14, 2020",
                "displaytime": "11:00 AM",
                "eventdateid": 19
            },
            "eventinfo": "Uncategorized: Test Event 11:00 AM December 14, 2020",
            "eventdateday": "December 14",
            "duration": 3.0,
            "user": null
        }
    ]
}
```
</details>   
   
:arrow_forward: **List Events with Titles Containing --** https://eschoolinthecloud.herokuapp.com/events/event/name/like/{searchterms}   
Example Output:   

<details>
<summary>https://eschoolinthecloud.herokuapp.com/events/event/name/like/thir </summary>
   
```JSON
[
    {
        "eventid": 33,
        "title": "Third",
        "description": "Test Event",
        "lengthchange": false,
        "length": 0.5,
        "lengthdesc": "30 Minutes",
        "category": {
            "categoryid": 25,
            "name": "Uncategorized"
        },
        "eventdates": [
            {
                "datee": {
                    "timeminute": 30,
                    "timedigital": 24,
                    "timeimperial": 12,
                    "timeimperialsuffix": "AM",
                    "timezone": "PDT",
                    "eventmonth": 9,
                    "eventmonthname": "September",
                    "eventday": 30,
                    "eventyear": 2020,
                    "display": "12:30 AM September 30, 2020",
                    "displaytime": "12:30 AM",
                    "eventdateid": 21
                },
                "eventinfo": "Uncategorized: Test Event 12:30 AM September 30, 2020",
                "eventdateday": "September 30",
                "duration": 0.5,
                "user": null
            },
            {
                "datee": {
                    "timeminute": 0,
                    "timedigital": 1,
                    "timeimperial": 1,
                    "timeimperialsuffix": "AM",
                    "timezone": "PDT",
                    "eventmonth": 2,
                    "eventmonthname": "February",
                    "eventday": 28,
                    "eventyear": 2021,
                    "display": "1:00 AM February 28, 2021",
                    "displaytime": "1:00 AM",
                    "eventdateid": 23
                },
                "eventinfo": "Uncategorized: Test Event 1:00 AM February 28, 2021",
                "eventdateday": "February 28",
                "duration": 0.5,
                "user": null
            }
        ]
    }
]
```   
   

</details>

:arrow_forward: **List All Events By Dates --** https://eschoolinthecloud.herokuapp.com/events/dates    
Example Output:

<details> 
<summary>https://eschoolinthecloud.herokuapp.com/events/dates</summary>

```JSON
[
    {
        "timeminute": 0,
        "timedigital": 2,
        "timeimperial": 2,
        "timeimperialsuffix": "AM",
        "timezone": "PDT",
        "eventmonth": 6,
        "eventmonthname": "June",
        "eventday": 24,
        "eventyear": 2021,
        "display": "2:00 AM June 24, 2021",
        "displaytime": "2:00 AM",
        "events": [
            {
                "event": {
                    "eventid": 31,
                    "title": "First",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 1.5,
                    "lengthdesc": "One and a Half Hours",
                    "category": {
                        "categoryid": 25,
                        "name": "Uncategorized"
                    }
                },
                "eventinfo": "Uncategorized: Test Event 2:00 AM June 24, 2021",
                "eventdateday": "June 24",
                "duration": 1.5,
                "user": null
            },
            {
                "event": {
                    "eventid": 32,
                    "title": "Second",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 3.0,
                    "lengthdesc": "Three Hours",
                    "category": {
                        "categoryid": 25,
                        "name": "Uncategorized"
                    }
                },
                "eventinfo": "Uncategorized: Test Event 2:00 AM June 24, 2021",
                "eventdateday": "June 24",
                "duration": 3.0,
                "user": null
            },
            {
                "event": {
                    "eventid": 36,
                    "title": "Sixth Event",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 2.5,
                    "lengthdesc": "Two and a Half Hours",
                    "category": {
                        "categoryid": 30,
                        "name": "Entertainment"
                    }
                },
                "eventinfo": "Entertainment: Test Event 2:00 AM June 24, 2021",
                "eventdateday": "June 24",
                "duration": 2.5,
                "user": null
            }
        ],
        "eventdateid": 16
    },
    {
        "timeminute": 30,
        "timedigital": 18,
        "timeimperial": 6,
        "timeimperialsuffix": "PM",
        "timezone": "PDT",
        "eventmonth": 10,
        "eventmonthname": "October",
        "eventday": 24,
        "eventyear": 2020,
        "display": "6:30 PM October 24, 2020",
        "displaytime": "6:30 PM",
        "events": [
            {
                "event": {
                    "eventid": 36,
                    "title": "Sixth Event",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 2.5,
                    "lengthdesc": "Two and a Half Hours",
                    "category": {
                        "categoryid": 30,
                        "name": "Entertainment"
                    }
                },
                "eventinfo": "Entertainment: Test Event 6:30 PM October 24, 2020",
                "eventdateday": "October 24",
                "duration": 2.5,
                "user": null
            },
            {
                "event": {
                    "eventid": 31,
                    "title": "First",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 1.5,
                    "lengthdesc": "One and a Half Hours",
                    "category": {
                        "categoryid": 25,
                        "name": "Uncategorized"
                    }
                },
                "eventinfo": null,
                "eventdateday": null,
                "duration": 0.0,
                "user": {
                    "userid": 37,
                    "fname": "Zach",
                    "lname": "Zach",
                    "username": "zach",
                    "primaryemail": "zach@z.c",
                    "useremails": [],
                    "hostedby": [
                        {
                            "event": {
                                "eventid": 31,
                                "title": "First",
                                "description": "Test Event",
                                "lengthchange": false,
                                "length": 1.5,
                                "lengthdesc": "One and a Half Hours",
                                "category": {
                                    "categoryid": 25,
                                    "name": "Uncategorized"
                                }
                            },
                            "datee": {
                                "timeminute": 30,
                                "timedigital": 18,
                                "timeimperial": 6,
                                "timeimperialsuffix": "PM",
                                "timezone": "PDT",
                                "eventmonth": 10,
                                "eventmonthname": "October",
                                "eventday": 24,
                                "eventyear": 2020,
                                "display": "6:30 PM October 24, 2020",
                                "displaytime": "6:30 PM",
                                "eventdateid": 17
                            },
                            "eventinfo": null,
                            "eventdateday": null,
                            "duration": 0.0
                        }
                    ],
                    "roles": [],
                    "events": [
                        {
                            "event": {
                                "eventid": 31,
                                "title": "First",
                                "description": "Test Event",
                                "lengthchange": false,
                                "length": 1.5,
                                "lengthdesc": "One and a Half Hours",
                                "category": {
                                    "categoryid": 25,
                                    "name": "Uncategorized"
                                }
                            },
                            "user": {
                                "userid": 37,
                                "fname": "Zach",
                                "lname": "Zach",
                                "username": "zach",
                                "primaryemail": "zach@z.c",
                                "useremails": [],
                                "hostedby": [
                                    {
                                        "event": {
                                            "eventid": 31,
                                            "title": "First",
                                            "description": "Test Event",
                                            "lengthchange": false,
                                            "length": 1.5,
                                            "lengthdesc": "One and a Half Hours",
                                            "category": {
                                                "categoryid": 25,
                                                "name": "Uncategorized"
                                            }
                                        },
                                        "datee": {
                                            "timeminute": 30,
                                            "timedigital": 18,
                                            "timeimperial": 6,
                                            "timeimperialsuffix": "PM",
                                            "timezone": "PDT",
                                            "eventmonth": 10,
                                            "eventmonthname": "October",
                                            "eventday": 24,
                                            "eventyear": 2020,
                                            "display": "6:30 PM October 24, 2020",
                                            "displaytime": "6:30 PM",
                                            "eventdateid": 17
                                        },
                                        "eventinfo": null,
                                        "eventdateday": null,
                                        "duration": 0.0
                                    }
                                ],
                                "roles": []
                            }
                        }
                    ]
                }
            }
        ],
        "eventdateid": 17
    },
    {
        "timeminute": 30,
        "timedigital": 20,
        "timeimperial": 8,
        "timeimperialsuffix": "PM",
        "timezone": "PDT",
        "eventmonth": 12,
        "eventmonthname": "December",
        "eventday": 4,
        "eventyear": 2020,
        "display": "8:30 PM December 4, 2020",
        "displaytime": "8:30 PM",
        "events": [
            {
                "event": {
                    "eventid": 36,
                    "title": "Sixth Event",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 2.5,
                    "lengthdesc": "Two and a Half Hours",
                    "category": {
                        "categoryid": 30,
                        "name": "Entertainment"
                    }
                },
                "eventinfo": "Entertainment: Test Event 8:30 PM December 4, 2020",
                "eventdateday": "December 4",
                "duration": 2.5,
                "user": null
            }
        ],
        "eventdateid": 18
    },
    {
        "timeminute": 0,
        "timedigital": 11,
        "timeimperial": 11,
        "timeimperialsuffix": "AM",
        "timezone": "PDT",
        "eventmonth": 12,
        "eventmonthname": "December",
        "eventday": 14,
        "eventyear": 2020,
        "display": "11:00 AM December 14, 2020",
        "displaytime": "11:00 AM",
        "events": [
            {
                "event": {
                    "eventid": 31,
                    "title": "First",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 1.5,
                    "lengthdesc": "One and a Half Hours",
                    "category": {
                        "categoryid": 25,
                        "name": "Uncategorized"
                    }
                },
                "eventinfo": "Uncategorized: Test Event 11:00 AM December 14, 2020",
                "eventdateday": "December 14",
                "duration": 1.5,
                "user": null
            },
            {
                "event": {
                    "eventid": 32,
                    "title": "Second",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 3.0,
                    "lengthdesc": "Three Hours",
                    "category": {
                        "categoryid": 25,
                        "name": "Uncategorized"
                    }
                },
                "eventinfo": "Uncategorized: Test Event 11:00 AM December 14, 2020",
                "eventdateday": "December 14",
                "duration": 3.0,
                "user": null
            },
            {
                "event": {
                    "eventid": 36,
                    "title": "Sixth Event",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 2.5,
                    "lengthdesc": "Two and a Half Hours",
                    "category": {
                        "categoryid": 30,
                        "name": "Entertainment"
                    }
                },
                "eventinfo": "Entertainment: Test Event 11:00 AM December 14, 2020",
                "eventdateday": "December 14",
                "duration": 2.5,
                "user": null
            }
        ],
        "eventdateid": 19
    },
    {
        "timeminute": 0,
        "timedigital": 19,
        "timeimperial": 7,
        "timeimperialsuffix": "PM",
        "timezone": "PDT",
        "eventmonth": 11,
        "eventmonthname": "November",
        "eventday": 24,
        "eventyear": 2020,
        "display": "7:00 PM November 24, 2020",
        "displaytime": "7:00 PM",
        "events": [
            {
                "event": {
                    "eventid": 32,
                    "title": "Second",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 3.0,
                    "lengthdesc": "Three Hours",
                    "category": {
                        "categoryid": 25,
                        "name": "Uncategorized"
                    }
                },
                "eventinfo": "Uncategorized: Test Event 7:00 PM November 24, 2020",
                "eventdateday": "November 24",
                "duration": 3.0,
                "user": null
            }
        ],
        "eventdateid": 20
    },
    {
        "timeminute": 30,
        "timedigital": 24,
        "timeimperial": 12,
        "timeimperialsuffix": "AM",
        "timezone": "PDT",
        "eventmonth": 9,
        "eventmonthname": "September",
        "eventday": 30,
        "eventyear": 2020,
        "display": "12:30 AM September 30, 2020",
        "displaytime": "12:30 AM",
        "events": [
            {
                "event": {
                    "eventid": 33,
                    "title": "Third",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 0.5,
                    "lengthdesc": "30 Minutes",
                    "category": {
                        "categoryid": 25,
                        "name": "Uncategorized"
                    }
                },
                "eventinfo": "Uncategorized: Test Event 12:30 AM September 30, 2020",
                "eventdateday": "September 30",
                "duration": 0.5,
                "user": null
            },
            {
                "event": {
                    "eventid": 36,
                    "title": "Sixth Event",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 2.5,
                    "lengthdesc": "Two and a Half Hours",
                    "category": {
                        "categoryid": 30,
                        "name": "Entertainment"
                    }
                },
                "eventinfo": "Entertainment: Test Event 12:30 AM September 30, 2020",
                "eventdateday": "September 30",
                "duration": 2.5,
                "user": null
            }
        ],
        "eventdateid": 21
    },
    {
        "timeminute": 30,
        "timedigital": 2,
        "timeimperial": 2,
        "timeimperialsuffix": "AM",
        "timezone": "PDT",
        "eventmonth": 6,
        "eventmonthname": "June",
        "eventday": 11,
        "eventyear": 2021,
        "display": "2:30 AM June 11, 2021",
        "displaytime": "2:30 AM",
        "events": [],
        "eventdateid": 22
    },
    {
        "timeminute": 0,
        "timedigital": 1,
        "timeimperial": 1,
        "timeimperialsuffix": "AM",
        "timezone": "PDT",
        "eventmonth": 2,
        "eventmonthname": "February",
        "eventday": 28,
        "eventyear": 2021,
        "display": "1:00 AM February 28, 2021",
        "displaytime": "1:00 AM",
        "events": [
            {
                "event": {
                    "eventid": 33,
                    "title": "Third",
                    "description": "Test Event",
                    "lengthchange": false,
                    "length": 0.5,
                    "lengthdesc": "30 Minutes",
                    "category": {
                        "categoryid": 25,
                        "name": "Uncategorized"
                    }
                },
                "eventinfo": "Uncategorized: Test Event 1:00 AM February 28, 2021",
                "eventdateday": "February 28",
                "duration": 0.5,
                "user": null
            }
        ],
        "eventdateid": 23
    },
    {
        "timeminute": 30,
        "timedigital": 0,
        "timeimperial": 12,
        "timeimperialsuffix": "AM",
        "timezone": "PDT",
        "eventmonth": 3,
        "eventmonthname": "March",
        "eventday": 19,
        "eventyear": 2021,
        "display": "12:30 AM March 19, 2021",
        "displaytime": "12:30 AM",
        "events": [],
        "eventdateid": 24
    }
]
```

</details>   
   
:arrow_forward: **Find an Event By Date By ID --** https://eschoolinthecloud.herokuapp.com/events/date/{dateid}   
Example Output:   

<details>
<summary>https://eschoolinthecloud.herokuapp.com/events/date/18</summary>
   
```JSON
{
    "timeminute": 30,
    "timedigital": 20,
    "timeimperial": 8,
    "timeimperialsuffix": "PM",
    "timezone": "PDT",
    "eventmonth": 12,
    "eventmonthname": "December",
    "eventday": 4,
    "eventyear": 2020,
    "display": "8:30 PM December 4, 2020",
    "displaytime": "8:30 PM",
    "events": [
        {
            "event": {
                "eventid": 36,
                "title": "Sixth Event",
                "description": "Test Event",
                "lengthchange": false,
                "length": 2.5,
                "lengthdesc": "Two and a Half Hours",
                "category": {
                    "categoryid": 30,
                    "name": "Entertainment"
                }
            },
            "eventinfo": "Entertainment: Test Event 8:30 PM December 4, 2020",
            "eventdateday": "December 4",
            "duration": 2.5,
            "user": null
        }
    ],
    "eventdateid": 18
}
```   

</details>

:arrow_forward: **List All Events By Categories --** https://eschoolinthecloud.herokuapp.com/events/categories   
Example Output:

<details>
<summary>https://eschoolinthecloud.herokuapp.com/events/categories</summary>

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

:arrow_forward: **List Events By Category Name --** https://eschoolinthecloud.herokuapp.com/events/category/name/{categoryname}
Example Output:   

<details>
<summary>https://eschoolinthecloud.herokuapp.com/events/category/name/Tech</summary>
   
```JSON
{
    "categoryid": 26,
    "name": "Tech",
    "events": [
        {
            "eventid": 32,
            "title": "Second Event",
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
        }
    ]
}
```

</details>

:arrow_forward: **List Events By Category By ID --** https://eschoolinthecloud.herokuapp.com/events/category/id/{categoryid}   
Example Output:

<details>
<summary>https://eschoolinthecloud.herokuapp.com/events/category/id/25</summary>

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

:arrow_forward: **List Events By Users Attending --** https://eschoolinthecloud.herokuapp.com/events/dates/users/events   
Example Output:   

<details>
<summary>https://eschoolinthecloud.herokuapp.com/events/dates/users/events </summary>
   
```JSON
[
    {
        "event": {
            "eventid": 31,
            "title": "First",
            "description": "Test Event",
            "lengthchange": false,
            "length": 1.5,
            "lengthdesc": "One and a Half Hours",
            "category": {
                "categoryid": 25,
                "name": "Uncategorized"
            }
        },
        "user": {
            "userid": 37,
            "fname": "Zach",
            "lname": "Zach",
            "username": "zach",
            "primaryemail": "zach@z.c",
            "useremails": [],
            "eventdates": [
                {
                    "event": {
                        "eventid": 31,
                        "title": "First",
                        "description": "Test Event",
                        "lengthchange": false,
                        "length": 1.5,
                        "lengthdesc": "One and a Half Hours",
                        "category": {
                            "categoryid": 25,
                            "name": "Uncategorized"
                        }
                    },
                    "datee": {
                        "timeminute": 30,
                        "timedigital": 18,
                        "timeimperial": 6,
                        "timeimperialsuffix": "PM",
                        "eventmonth": 10,
                        "eventmonthname": "October",
                        "eventday": 24,
                        "eventyear": 2020,
                        "eventdateid": 17
                    },
                    "eventinfo": null,
                    "eventdateday": null
                }
            ],
            "roles": []
        }
    },
    {
        "event": {
            "eventid": 31,
            "title": "First",
            "description": "Test Event",
            "lengthchange": false,
            "length": 1.5,
            "lengthdesc": "One and a Half Hours",
            "category": {
                "categoryid": 25,
                "name": "Uncategorized"
            }
        },
        "user": {
            "userid": 38,
            "fname": "Guest",
            "lname": "1032",
            "username": "testone",
            "primaryemail": "test1@z.c",
            "useremails": [],
            "eventdates": [],
            "roles": []
        }
    },
    {
        "event": {
            "eventid": 31,
            "title": "First",
            "description": "Test Event",
            "lengthchange": false,
            "length": 1.5,
            "lengthdesc": "One and a Half Hours",
            "category": {
                "categoryid": 25,
                "name": "Uncategorized"
            }
        },
        "user": {
            "userid": 41,
            "fname": "Guest",
            "lname": "3632",
            "username": "testfour",
            "primaryemail": "test4@z.c",
            "useremails": [],
            "eventdates": [],
            "roles": []
        }
    },
    {
        "event": {
            "eventid": 33,
            "title": "Third",
            "description": "Test Event",
            "lengthchange": false,
            "length": 0.5,
            "lengthdesc": "30 Minutes",
            "category": {
                "categoryid": 25,
                "name": "Uncategorized"
            }
        },
        "user": {
            "userid": 39,
            "fname": "Guest",
            "lname": "2289",
            "username": "testtwo",
            "primaryemail": "test2@z.c",
            "useremails": [],
            "eventdates": [],
            "roles": []
        }
    },
    {
        "event": {
            "eventid": 34,
            "title": "Fourth",
            "description": "Test Event",
            "lengthchange": false,
            "length": 5.0,
            "lengthdesc": "Five Hours",
            "category": {
                "categoryid": 28,
                "name": "Literature"
            }
        },
        "user": {
            "userid": 40,
            "fname": "Guest",
            "lname": "4811",
            "username": "testthree",
            "primaryemail": "test3@z.c",
            "useremails": [],
            "eventdates": [],
            "roles": []
        }
    }
]
```

</details>


### POST REQs

:arrow_forward: **Add A New Event --** https://eschoolinthecloud.herokuapp.com/events/event
   

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

Location: https://eschoolinthecloud.herokuapp.com/events/event/38
*Status: 200 Okay*

</details>   

:arrow_forward: **Add A New Event Category --** https://eschoolinthecloud.herokuapp.com/events/category

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

Location: https://eschoolinthecloud.herokuapp.com/events/category/39
*Status: 201 Created*

</details>   

:arrow_forward: **Add A New Attendee --** https://eschoolinthecloud.herokuapp.com/events/dates/users/attendee   
   
## CATEGORY TABLE
   
Name | Data Type (min, max)
------------ | -------------
**Event**| **Event**
**User** | **User**


   
<details>
<summary>Minimum Body</summary>
   
```JSON
{
    "event": {
        "eventid": 31,
        "category": {
            "categoryid": 25,
            "name": "Uncategorized"
        }
    },
    "user": {
        "userid": 4,
        "hostedby": [
            {
                "event": {
                    "eventid": 31,
                    "category": {
                        "categoryid": 25
                    }
                },
                "datee": {
                    "eventdateid": 17
                }
            }
        ]
    }
}
```   

<details>
<summary>Postman Results:</summary>
   
Location: https://eschoolinthecloud.herokuapp.com/events/dates/users/attendee/4   
*Status: 201 Created*   

</details>

</details>


### PATCH REQs

:arrow_forward: **Update Event By ID --** https://eschoolinthecloud.herokuapp.com/events/event/{eventid}

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

Location: https://eschoolinthecloud.herokuapp.com/events/event/38
*Status: 200 Okay*

</details>

### Delete REQs

:arrow_forward: **Delete Event By ID --** https://eschoolinthecloud.herokuapp.com/events/event/   

<details>
<summary>https://eschoolinthecloud.herokuapp.com/events/event/38</summary>

*Status: 200 Okay*

</details>









</details>