#pip install beautifulsoup4
#import requests
#from bs4 import BeautifulSoup
#import requests
# from lxml import etree
import requests
from bs4 import BeautifulSoup
response=requests.get("https://www.baidu.com/?tn=88093251_110_hao_pg")
print(response)

import requests
from bs4 import BeautifulSoup

response = requests.get('https://www.example.com')
soup = BeautifulSoup(response.text, 'html.parser')

# 使用 BeautifulSoup 提取数据
title = soup.find('title').text
print(title)