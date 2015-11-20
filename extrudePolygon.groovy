double size=40;
//create an extruded polygon
CSG polygon = Extrude.points(new Vector3d(0, 0, size),// This is the  extrusion depth
                new Vector3d(0,0),// All values after this are the points in the polygon
                new Vector3d(size*2,0),// Bottom right corner
                new Vector3d(size*1.5,size),// upper right corner
                new Vector3d(size/2,size)// upper left corner
        );
return polygon