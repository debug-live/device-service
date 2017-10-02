

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

## user database

- user table 

field | type
------|-----
id | pk
user_name | string
full_name | string

- login_history

field | type
------|-----
id | pk
user_id | string
login_time | timestamp

## device database

- device table

field | type
------|-----
id | pk
serial_num | int
model | string


- connection_history

field | type
------|-----
id | pk
device_id | string
connect_time | timestamp

# Skills TBK
1. DB design: conception/logical design?
1. UT cases
1. Web FW?
1. security
