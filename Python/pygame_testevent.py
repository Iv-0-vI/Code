import pygame
pygame.init()
pygame.display.set_mode((500,300))
pygame.display.set_caption("Hello Pygame")
print(pygame.KEYDOWN)
while True:
    for event in pygame.event.get():
        if event.type==pygame.KEYDOWN:
            key = pygame.key.name(event.key)
            print(key,"was pressed")
