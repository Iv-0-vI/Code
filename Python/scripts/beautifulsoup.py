import requests
from bs4 import BeautifulSoup
response = requests.get('https://www.runoob.com')
soup = BeautifulSoup(response.text, 'html.parser')
title = soup.find('title').text
print(title)