from bs4 import BeautifulSoup
html = """
<html>
    <body>
        <p class="title">Hello World!</p>
        <p class="title">Hello BeautifulSoup!</p>
    </body>
</html>
"""
soup = BeautifulSoup(html, 'html.parser')
# 查找第一个 <p> 标签
p_tag = soup.find('p')
print(p_tag.text)  # 输出：Hello World!

# 查找具有特定类名的第一个 <p> 标签
title_tag = soup.find('p', class_='title')
print(title_tag.text)  # 输出：Hello World!

# 查找具有特定属性的第一个元素
attr_tag = soup.find(attrs={'class': 'title'})
print(attr_tag.text)  # 输出：Hello World!
