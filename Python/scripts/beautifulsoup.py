import requests
from bs4 import BeautifulSoup
# 将一大块东西命名
response = requests.get('https://www.runoob.com')
soup = BeautifulSoup(response.text, 'html.parser')
title = soup.find('title').text
print(title)