from vpython import *


class Turtle3D:

    def __init__(self):
        """
        Initializes the turtle at the origin of the coordinates
        looking horizontally to the right and in red

        Parameters
        ----------
        None

        Returns
        -------
        None
        """
        self._activeScene = False
        self._yaw = 0
        self._pitch = 0
        self._turtle = None
        self._currentPaintingColor = color.red
        self._homePosition = vector(0, 0, 0)
        self._homeOrientation = vector(1, 0, 0)
        self._canDraw = True
        self.trailWidth = 0.08
        #print("Hi!, I am a turtle :D!")

    def setupScene(self):
        """
        Initializes a default scene, the turtle object and draws it in the scene

        Parameters
        ----------
        None

        Returns
        -------
        None
        """
        self._activeScene = True
        scene.height = scene.width = 1000
        scene.autocenter = True
        scene.caption = """\nTo rotate "camera", drag with right button or Ctrl-drag.\nTo zoom, drag with middle button or Alt/Option depressed, or use scroll wheel.\n  On a two-button mouse, middle is left + right.\nTo pan left/right and up/down, Shift-drag.\nTouch screen: pinch/extend to zoom, swipe or two-finger rotate.\n"""
   
        self._turtle = cylinder(
            pos=self._homePosition,
            axis=self._homeOrientation,
            radius=0.1,
            color=color.green)

    def _getDirection(self):
        """
        Returns the direction calculated from the current Euler Angles 
        of the turtle.

        Parameters
        ----------
        None

        Returns
        -------
        A vector with the calculated direction
        """
        yaw = self._yaw
        pitch = self._pitch
        x = cos(yaw) * cos(pitch)
        z = sin(yaw) * cos(pitch)
        y = sin(pitch)
        return vector(x, y, z)

    def _draw(self, distance):
        """
        Draws the turtle and three objects more in the scene, a cylinder 
        of size distance which acts as the trail of the turtle 
        and two cilinders at both ends of it for aesthetic purposes. 
        Only leaves a trail if '_canDraw' is true otherwise just changes 
        the direction and position of the turtle according to the 
        displacement of the distance.
        

        Parameters
        ----------
        distance: float
            A float that indicates the displacement of the turtle in the direction
            described by its current Euler angles 
        Returns
        -------
        None
        """
        direction = self._getDirection()
        oldPosition = self._turtle.pos
        newPosition = direction * distance + oldPosition
        newAxis = newPosition - oldPosition
        if(self._canDraw):
            sphere(
                pos=oldPosition,
                radius=self.trailWidth,
                color=self._currentPaintingColor)
            cylinder(
                pos=oldPosition,
                axis=newAxis,
                radius=self.trailWidth,
                color=self._currentPaintingColor)
            sphere(
                pos=newPosition,
                radius=self.trailWidth,
                color=self._currentPaintingColor)
        self._turtle.pos = newPosition
        self._turtle.axis = direction

    def forward(self, distance):
        """
        Moves the turtle forward in the current direction a distance 'distance'.

        Parameters
        ----------
        distance : float
            A float describing the distance the turtle will move.

        Returns
        -------
        None
        """
        # print("forward")
        self._draw(distance)

    def backward(self, distance):
        """
        Moves the turtle in the opposite direction to the current direction a distance 'distance'.

        Parameters
        ----------
        distance : float
            A float describing the distance the turtle will move.

        Returns
        -------
        None
        """
        # print("backward")
        self._draw(-distance)

    def left(self, deg):
        """
        Changes the turtle direction 'deg' degrees towards the left with respect to the horizontal axis.

        Parameters
        ----------
        deg : float
            A float describing the degrees turtle will rotate.

        Returns
        -------
        None
        """
        self._yaw += radians(-deg)
        self._draw(0)
        # print("left")

    def right(self, deg):
        """
        Changes the turtle direction 'deg' degrees towards the right with respect to the horizontal axis.

        Parameters
        ----------
        deg : float
            A float describing the degrees turtle will rotate.

        Returns
        -------
        None
        """
        self._yaw += radians(deg)
        self._draw(0)
        # print("right")

    def up(self, deg):
        """
        Changes the turtle direction 'deg' degrees up with respect to the vertical axis.

        Parameters
        ----------
        deg : float
            A float describing the degrees turtle will rotate.

        Returns
        -------
        None
        """
        self._pitch += radians(deg)
        self._draw(0)
        # print("up")

    def down(self, deg):
        """
        Changes the turtle direction 'deg' degrees down with respect to the vertical axis.

        Parameters
        ----------
        deg : float
            A float describing the degrees turtle will rotate.

        Returns
        -------
        None
        """
        self._pitch += radians(-deg)
        self._draw(0)
        # print("down")

    def color(self, r, g, b):
        """
        Changes the color used, by the turtle, to draw on screen.

        Parameters
        ----------
        r : float
            A float value denoting the red component in RGB, between 0 and 1.
        g : float
            A float value denoting the green component in RGB, between 0 and 1.
        b : float
            A float value denoting the blue component in RGB, between 0 and 1.
        Returns
        -------
        None
        """
        self._currentPaintingColor = vector(r, g, b)
        #print("set color!")

    def hide(self):
        """
        The turtle stops drawing on screen while moving.

        Parameters
        ----------
        None

        Returns
        -------
        None
        """
        self._canDraw = False
        # print("hide")

    def show(self):
        """
        The turtle starts drawing on screen while moving.

        Parameters
        ----------
        None

        Returns
        -------
        None
        """
        self._canDraw = True
        # print("show")

    def home(self):
        """
        Changes the turtle's position to its original position and orientation.

        Parameters
        ----------
        None

        Returns
        -------
        None
        """
        # print("home")
        self._pitch = 0
        self._yaw = 0
        self._turtle.pos = self._homePosition
        self._turtle.axis = self._homeOrientation

    def isSceneActive(self):
        """
        Verifies if the scene has already been initialized or not.

        Parameters
        ----------
        None

        Returns
        -------
        activeScene : bool
            Returns true if the scene has already been initialized. False otherwise.
        """
        return self._activeScene
