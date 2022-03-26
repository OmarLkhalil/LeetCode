class Solution:
   def nearestValidPoint(self, x, y, points):
        init_d=float('inf')
        result=-1
        for i in range(len(points)):
            
            x0 = points[i][0]
            y0 = points[i][1]
            dx = x - x0 
            dy = y - y0
            
            if dx == 0 or dy == 0:
                distance = abs(dx) + abs(dy)
                if distance < init_d:
                    init_d, result = distance, i
        return result
