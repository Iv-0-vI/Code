import pygame,sys
pygame.init()
screen=pygame.display.set_mode((300,200))
caption=pygame.display.set_caption("Hello event getpressed")
gets=pygame.key.get_pressed()#false
print(gets)