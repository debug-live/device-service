

## Web UI Service
1. device CRUD
   - C
      1. add device
   - R (push event support)
      1. connection status
      1. static device info: device type, ...
   - U
      1. device update
   - D
      1. mark destroyed
1. user CRUD
   - R
      1. show user profile
   - U
      1. update user profile

## Device Service
1. device connection/disconnection
   - update connection status (cache)
1. device update

# Database

- user table 

---|------
id | name
---|------

- device table

---|-----------|----
id | device_id | type
---|-----------|----

- device connection history

id | connect timestamp | disconnect timestamp
