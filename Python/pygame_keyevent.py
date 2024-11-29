import pygame,sys
pygame.init()
screen=pygame.display.set_mode((300,200))
caption=pygame.display.set_caption("Hello event key")
while True:
    for event in pygame.event.get():
        if event.type==pygame.QUIT:
            pygame.quit()
            sys.exit()
        if event.type==pygame.KEYDOWN:
            key=pygame.key.name(event.key)
            print(key,"down")
        if event.type==pygame.KEYUP:
            key=pygame.key.name(event.key)
            print(key,"up")