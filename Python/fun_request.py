# pip3 install requests
import requests
req = requests.get("https://www.runoob.com/")
print(req.content)