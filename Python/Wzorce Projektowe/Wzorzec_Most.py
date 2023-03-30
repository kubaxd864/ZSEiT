# Wzorzec Projektowy Most jest wzorcem strukturalnym, który ma za zadanie oddzielić abstrakcję od implementacji, 
# tak aby te dwie części mogły być rozwijane niezależnie. W ten sposób możemy zmieniać implementację bez wpływu na kod klienta, 
# który korzysta z abstrakcji.


class AbstractShape:
    def __init__(self, renderer):
        self.renderer = renderer
    
    def draw(self):
        pass
    
    def resize(self, factor):
        pass

class Circle(AbstractShape):
    def __init__(self, renderer, radius):
        super().__init__(renderer)
        self.radius = radius
    
    def draw(self):
        self.renderer.render_circle(self.radius)
    
    def resize(self, factor):
        self.radius *= factor

class RasterRenderer:
    def render_circle(self, radius):
        print(f"Rasterizing circle with radius {radius}")

class VectorRenderer:
    def render_circle(self, radius):
        print(f"Drawing a circle with radius {radius}")

vector_circle = Circle(VectorRenderer(), 5)
vector_circle.draw()

raster_circle = Circle(RasterRenderer(), 5)
raster_circle.draw()