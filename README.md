

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

---|-----------|---------
id | user_name | full_name
---|-----------|---------

- device table

---|-----------|----
id | serial_num | model
---|-----------|----

- device connection history

id | device_id | connect_time

# Skills TBK
1. DB design: conception/logical design?
1. UT cases
1. Web FW?
1. security
