import time
now = time.time()
print(now)# 1731983761.720892

localtime = time.localtime(time.time())
print ("本地时间为 :", localtime)
# 本地时间为 : time.struct_time(tm_year=2024, tm_mon=11, tm_mday=19, tm_hour=10, tm_min=39, tm_sec=34, tm_wday=1, tm_yday=324, tm_isdst=0)
print(localtime.tm_year,"年")