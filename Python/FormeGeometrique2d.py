from abc import abstractmethod
import FormeGeometrique

class FormeGeometrique2d(FormeGeometrique):
    def __init__(self, nom:str) -> None:
        super().__init__(nom)

    @abstractmethod
    def calculer_surface(self) -> int:
        ...

    @abstractmethod
    def calculer_perimetre(self) -> int:
        ...

    def is_bigger(self, hFormeGeometrique2d:object) -> bool:
        return self.__class__.__name__ == hFormeGeometrique2d.__class__.__name__ and super.is_bigger(hFormeGeometrique2d) and self.calculer_perimetre() == hFormeGeometrique2d.calculer_perimetre()

    def __str__(self) -> str:
        return super().__str__() + "\nPerimetre : " + self.calculer_perimetre()

    def __eq__(self, other: object) -> bool:
        return super().__eq__(other) and other.__class__.__name__ == self.__class__.__name__