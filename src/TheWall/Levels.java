package TheWall;
/**
 * @author Erdem Ege Marasli
 * @author Ensar Kaya
 */
/**
 * For squareLocations
 * 0 = empty
 * 1 = blueKnights
 * 2 = redKnights
 * 3 = castle
 * For Edge
 * 0 = empty
 * 1 = non empty
 * For Rectangles
 * 0 = empty
 * 1 = wall
 * 2 = castle wall
 * This class contains levels for classical mode, chalange mode and story mode.
 */

public class Levels {
    Map [] levels = new Map[64];
    //int [] squareLocations; // 16
    //int [] edgeLocations; // 26
    //int [] horizontalRectangleLocations; // 20
    //int [] verticalRectangleLocations; // 21
    public Levels(){        int [] squareLocations = {3,3,0,
            0,0,0,0,0,
            0,0,1,0,1,
              0,0,1};
int [] edgeLocations = {0,0,1,0,
            0,1,0,0,1,0,
            0,0,0,0,0,0,
            0,0,0,0,0,1,
            0,0,0,0};
int [] horizontalRectangleLocations = {1,1,0,
                        0,1,1,1,0,
                        0,0,1,0,1,
                        0,0,1,0,1,
                          0,0,1};
int [] verticalRectangleLocations = {1,2,1,0,
                        0,0,0,1,1,0,
                        0,0,1,0,0,1,
                        0,0,1,1};
levels[0] = new Map(squareLocations,edgeLocations,horizontalRectangleLocations,verticalRectangleLocations);
int [] squareLocations1 = {0,0,1,
            0,0,0,2,0,
            0,1,0,3,2,
              0,2,3};
int [] edgeLocations1 = {0,1,0,0,
            0,1,0,0,0,0,
            0,0,0,0,0,0,
            0,1,0,0,0,0,
            0,0,1,0};
int [] horizontalRectangleLocations1 = {0,1,1,
                            0,1,0,1,0,
                            0,1,0,1,0,
                            0,1,1,2,0,
                            0,0,1};
int [] verticalRectangleLocations1 = {0,1,0,1,
                        0,1,0,1,0,0,
                        0,1,1,0,1,0,
                          0,0,1,1};
levels[1] = new Map(squareLocations1,edgeLocations1,horizontalRectangleLocations1,verticalRectangleLocations1);
int [] squareLocations2 = {0,3,0,
             1,0,3,0,1,
             0,0,0,0,0,
	           0,0,0};
int [] edgeLocations2 = {1,0,1,0,
	        1,0,0,0,0,1,
	        0,0,0,0,0,0,
	        0,0,0,0,0,0,
	        0,0,0,0};
int [] horizontalRectangleLocations2={1,1,0,
                        1,1,2,1,1,
                        1,0,1,0,1,
                        0,0,0,0,0,
                          0,0,0};
int [] verticalRectangleLocations2 = {1,1,1,0,
                        1,1,1,1,1,1,
                        0,0,0,0,0,0,
                        0,0,0,0};
levels[2] = new Map(squareLocations2,edgeLocations2,horizontalRectangleLocations2,verticalRectangleLocations2);
int [] squareLocations3 = {0,1,0,
				        0,0,0,0,0,
				        0,3,0,1,0,
				          3,0,0};
int [] edgeLocations3 = {0,1,0,0,
				       0,0,0,0,0,0,
				       0,0,0,0,0,0,
				       1,0,0,0,1,0,
				       1,0,0,0};
int [] horizontalRectangleLocations3={0,1,0,
				                   0,1,0,0,0,
				                   1,0,1,1,0,
				                   1,2,0,1,0,
				                     1,1,0};
int [] verticalRectangleLocations3 = {0,1,1,0,
				                   0,1,1,1,0,0,
				                   1,0,0,0,1,0,
				                   1,0,1,0};
levels[3] = new Map(squareLocations3,edgeLocations3,horizontalRectangleLocations3,verticalRectangleLocations3);
int [] squareLocations4 = {1,3,0,
				        1,2,3,0,0,
				        0,0,1,0,0,
				          0,0,0};
int [] edgeLocations4 = {1,0,1,0,
				       1,0,0,0,0,0,
				       0,0,0,0,0,0,
				       0,0,0,1,0,0,
				       0,0,0,0};
int [] horizontalRectangleLocations4={1,1,0,
				                   1,1,2,1,0,
				                   1,0,1,0,0,
				                   0,0,1,0,0,
				                     0,0,0};
int [] verticalRectangleLocations4 = {1,1,1,0,
				                   1,1,1,1,1,0,
				                   0,0,1,1,0,0,
				                   0,0,0,0};
levels[4] = new Map(squareLocations4,edgeLocations4,horizontalRectangleLocations4,verticalRectangleLocations4);
int [] squareLocations5 = {3,3,0,
				        2,0,0,0,0,
				        2,1,0,1,0,
				          0,2,2};
int [] edgeLocations5 = {0,0,1,0,
				       0,1,0,0,1,0,
				       0,1,0,0,0,0,
				       0,0,0,0,0,0,
				       0,0,0,0};
int [] horizontalRectangleLocations5={
					 1,1,0,
                   0,1,1,1,0,
                   0,1,1,0,1,
                   0,1,0,1,0,
                     0,0,0};
int [] verticalRectangleLocations5 = {
		  			1,2,1,0,
                   0,0,1,0,1,0,
                   0,1,1,1,1,0,
                   0,0,0,0};
levels[5] = new Map(squareLocations5,edgeLocations5,horizontalRectangleLocations5,verticalRectangleLocations5);
int [] squareLocations6 = {3,3,1,
        0,2,0,0,0,
        2,0,0,2,0,
          0,2,0};
int [] edgeLocations6 = {0,0,0,1,
       0,1,0,0,0,1,
       0,0,0,0,0,0,
       0,0,0,0,1,0,
       0,0,0,0};
int [] horizontalRectangleLocations6={
	 1,1,1,
   0,1,1,0,1,
   0,0,1,1,0,
   0,0,0,1,
     0,0,0};
int [] verticalRectangleLocations6= {
		1,2,1,1,
   0,0,1,1,0,1,
   0,0,0,1,1,1,
   0,0,0,0};
levels[6] = new Map(squareLocations6,edgeLocations6,horizontalRectangleLocations6,verticalRectangleLocations6);
int [] squareLocations7 = {2,0,2,
        0,0,1,3,2,
        0,0,2,3,0,
          0,1,0};
int [] edgeLocations7 = {1,0,1,0,
       0,0,0,0,1,0,
       0,0,0,0,0,0,
       0,0,0,0,0,1,
       0,0,0,0};
int [] horizontalRectangleLocations7={
	 1,1,0,
   0,0,0,1,0,
   0,0,1,2,1,
   0,0,1,0,1,
     0,1,1};
int [] verticalRectangleLocations7= {
		1,1,1,0,
   0,0,1,0,1,0,
   0,0,0,1,0,1,
   0,1,0,1};
levels[7] = new Map(squareLocations7,edgeLocations7,horizontalRectangleLocations7,verticalRectangleLocations7);
int [] squareLocations8= {0,0,1,
        0,0,2,3,0,
        0,1,0,3,0,
          0,0,0};
int [] edgeLocations8= {0,0,0,1,
       0,0,0,0,0,0,
       0,0,0,0,0,0,
       0,1,0,0,0,1,
       0,0,0,1};
int [] horizontalRectangleLocations8={
	 0,0,1,
   0,0,1,0,1,
   0,1,1,2,0,
   0,1,1,0,1,
     0,0,1};
int [] verticalRectangleLocations8={
		0,0,1,1,
   0,0,0,1,0,1,
   0,1,1,0,0,1,
   0,0,1,1};
levels[8] = new Map(squareLocations8,edgeLocations8,horizontalRectangleLocations8,verticalRectangleLocations8);
int [] squareLocations9= {0,0,0,
        0,1,2,1,2,
        0,0,0,0,2,
          0,3,3};
int [] edgeLocations9={0,0,0,0,
       0,0,0,0,0,0,
       0,0,0,0,1,0,
       0,1,0,0,1,0,
       0,1,0,0};
int [] horizontalRectangleLocations9={
	 0,0,0,
   0,1,0,1,0,
   1,0,1,1,0,
   0,1,1,1,0,
     0,1,1};
int [] verticalRectangleLocations9={
		0,0,0,0,
   0,1,1,1,1,0,
   0,1,0,1,0,0,
   0,1,2,1};
levels[9] = new Map(squareLocations9,edgeLocations9,horizontalRectangleLocations9,verticalRectangleLocations9);
int [] squareLocations10= {2,2,2,
        1,0,0,1,0,
        0,3,0,0,0,
          3,2,0};
int [] edgeLocations10={0,0,0,1,
       0,0,0,0,0,0,
       0,0,0,0,1,0,
       0,0,0,1,0,0,
       1,0,0,0};
int [] horizontalRectangleLocations10={
	 0,0,1,
   1,0,1,1,0,
   0,1,0,1,0,
   1,2,1,0,0,
     1,0,0};
int [] verticalRectangleLocations10={
		0,0,0,1,
   1,1,1,0,1,0,
   1,0,0,1,0,0,
   1,1,0,0};
levels[10] = new Map(squareLocations10,edgeLocations10,horizontalRectangleLocations10,verticalRectangleLocations10);
int [] squareLocations11= {0,0,0,
        0,3,3,0,0,
        0,2,0,0,1,
          0,1,0};
int [] edgeLocations11={0,0,1,0,
       0,0,0,0,1,0,
       0,0,0,0,0,0,
       0,0,0,0,0,1,
       0,1,0,0};
int [] horizontalRectangleLocations11={
	 1,1,0,
   0,1,0,1,0,
   0,1,0,0,1,
   0,0,1,0,1,
     0,1,1};
int [] verticalRectangleLocations11={
		0,1,1,0,
   0,1,2,0,1,0,
   0,0,1,0,0,1,
   0,1,0,1};
levels[11] = new Map(squareLocations11,edgeLocations11,horizontalRectangleLocations11,verticalRectangleLocations11);
int [] squareLocations12= {3,0,0,
        0,3,0,0,1,
        0,0,0,0,1,
          0,0,0};
int [] edgeLocations12={0,0,0,1,
       0,0,0,0,0,1,
       0,0,1,0,0,0,
       0,0,0,0,1,0,
       0,0,0,0};
int [] horizontalRectangleLocations12={
	 1,0,1,
   1,2,1,0,1,
   0,1,0,1,0,
   0,0,0,0,1,
     0,0,0};
int [] verticalRectangleLocations12={
		1,1,1,1,
   0,1,1,1,0,1,
   0,0,0,0,1,1,
   0,0,0,0};
levels[12] = new Map(squareLocations12,edgeLocations12,horizontalRectangleLocations12,verticalRectangleLocations12);
int [] squareLocations13= {2,2,3,
        0,1,2,3,0,
        0,2,0,0,1,
          0,0,0};
int [] edgeLocations13={0,0,0,1,
       0,1,0,0,0,0,
       1,0,0,0,0,0,
       0,0,0,0,0,1,
       0,0,0,0};
int [] horizontalRectangleLocations13={
	 0,0,1,
   0,1,1,2,1,
   1,1,0,1,0,
   0,0,0,0,1,
     0,0,0};
int [] verticalRectangleLocations13={
		0,0,1,1,
   0,1,1,1,1,1,
   1,0,0,0,1,1,
   0,0,0,0};
levels[13] = new Map(squareLocations13,edgeLocations13,horizontalRectangleLocations13,verticalRectangleLocations13);
int [] squareLocations14= {0,0,0,
        0,1,2,3,0,
        0,0,1,3,0,
          0,2,0};
int [] edgeLocations14={0,0,0,0,
       0,0,0,0,0,0,
       1,0,0,0,0,1,
       0,1,0,0,0,0,
       0,1,0,0};
int [] horizontalRectangleLocations14={
	 0,0,0,
   0,1,0,1,1,
   1,0,1,2,1,
   0,1,1,1,0,
     0,1,0};
int [] verticalRectangleLocations14={
		0,0,0,0,
   1,1,1,1,0,1,
   0,1,0,0,1,0,
   0,1,0,0};
levels[14] = new Map(squareLocations14,edgeLocations14,horizontalRectangleLocations14,verticalRectangleLocations14);
int [] squareLocations15= {
	  0,2,0,
        1,1,0,0,0,
        2,2,3,0,0,
          1,3,0};
int [] edgeLocations15={0,0,0,0,
       1,0,1,0,0,0,
       0,0,0,1,0,0,
       0,0,0,0,0,0,
       0,0,1,0};
int [] horizontalRectangleLocations15={
     1,0,0,
   1,1,0,0,0,
   1,1,1,0,0,
   0,1,2,0,0,
     1,1,0};
int [] verticalRectangleLocations15={
    1,0,0,0,
   1,1,1,0,0,0,
   0,0,1,1,0,0,
   1,1,1,0};
levels[15] = new Map(squareLocations15,edgeLocations15,horizontalRectangleLocations15,verticalRectangleLocations15);
int [] squareLocations16= {
	  0,3,0,
        1,2,3,0,0,
        0,0,0,1,0,
          0,0,0};
int [] edgeLocations16={1,0,1,0,
       1,0,0,0,0,0,
       0,0,0,0,0,0,
       0,0,0,0,1,0,
       0,0,0,0};
int [] horizontalRectangleLocations16={
     1,1,0,
   1,1,2,1,0,
   1,0,1,0,0,
   0,0,0,1,0,
     0,0,0};
int [] verticalRectangleLocations16={
    1,1,1,0,
   1,1,1,1,1,0,
   0,0,0,1,1,0,
   0,0,0,0};
levels[16] = new Map(squareLocations16,edgeLocations16,horizontalRectangleLocations16,verticalRectangleLocations16);
int [] squareLocations17= {
	  2,1,0,
        0,0,3,0,0,
        0,2,3,0,1,
          0,1,0};
int [] edgeLocations17={0,0,1,0,
       0,0,0,0,1,0,
       0,0,0,0,0,0,
       0,0,0,0,0,1,
       0,1,0,0};
int [] horizontalRectangleLocations17={
     1,1,0,
   0,1,0,1,0,
   0,1,2,0,1,
   0,0,1,0,1,
     0,1,1};
int [] verticalRectangleLocations17={
    0,1,1,0,
   0,1,0,0,1,0,
   0,0,1,0,0,1,
   0,1,0,1};
levels[17] = new Map(squareLocations17,edgeLocations17,horizontalRectangleLocations17,verticalRectangleLocations17);
int [] squareLocations18= {
	  1,0,0,
        0,0,2,0,0,
        0,3,3,1,0,
          0,1,0};
int [] edgeLocations18={1,0,0,0,
       0,0,0,0,0,0,
       0,0,0,0,0,0,
       1,0,0,0,1,0,
         1,0,0,0};
int [] horizontalRectangleLocations18={
     1,0,0,
   0,1,0,0,0,
   1,0,1,1,0,
   1,0,0,1,0,
     1,1,0};
int [] verticalRectangleLocations18={
    1,1,0,0,
   0,1,1,1,0,0,
   1,0,2,0,1,0,
   1,0,1,0};
levels[18] = new Map(squareLocations18,edgeLocations18,horizontalRectangleLocations18,verticalRectangleLocations18);
int [] squareLocations19= {
	  1,3,3,
        0,0,0,0,0,
        0,0,1,0,0,
          0,0,0};
int [] edgeLocations19={1,0,0,0,
       1,0,1,0,0,0,
       0,0,0,0,0,0,
       0,0,1,0,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations19={
     1,1,1,
   1,0,1,1,0,
   0,1,0,1,0,
   0,0,1,0,0,
     0,0,0};
int [] verticalRectangleLocations19={
    1,1,2,0,
   1,1,0,1,0,0,
   0,0,1,1,1,0,
   0,0,0,0};
levels[19] = new Map(squareLocations19,edgeLocations19,horizontalRectangleLocations19,verticalRectangleLocations19);
int [] squareLocations20= {
	  2,1,2,
        0,0,0,0,0,
        0,0,3,0,2,
          0,3,1};
int [] edgeLocations20={0,0,0,0,
       0,1,0,0,0,0,
       0,0,0,0,0,0,
       0,1,0,0,0,0,
         0,1,0,1};
int [] horizontalRectangleLocations20={
     0,1,0,
   0,1,0,1,0,
   0,1,0,1,0,
   0,1,2,1,0,
     0,1,1};
int [] verticalRectangleLocations20={
    0,1,1,0,
   0,1,0,0,1,0,
   0,1,0,1,0,0,
   0,1,1,1};
levels[20] = new Map(squareLocations20,edgeLocations20,horizontalRectangleLocations20,verticalRectangleLocations20);
int [] squareLocations21= {
	  0,0,0,
        0,2,2,0,0,
        0,1,3,1,0,
          2,3,0};
int [] edgeLocations21={0,0,0,0,
       0,0,1,0,0,0,
       0,0,0,0,0,0,
       0,0,0,0,0,1,
         0,1,0,1};
int [] horizontalRectangleLocations21={
     0,0,0,
   0,1,0,1,0,
   0,1,1,0,1,
   0,1,2,0,1,
     0,1,1};
int [] verticalRectangleLocations21={
    0,0,0,0,
   0,0,1,1,1,1,
   0,1,0,0,0,1,
   0,1,1,1};
levels[21] = new Map(squareLocations21,edgeLocations21,horizontalRectangleLocations21,verticalRectangleLocations21);
int [] squareLocations22= {
	  1,2,2,
        0,2,0,1,0,
        0,3,3,2,0,
          0,0,0};
int [] edgeLocations22={
	 0,1,0,1,
       0,0,0,0,0,0,
       0,0,0,0,1,0,
       0,0,0,1,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations22={
     1,0,1,
   0,1,1,1,0,
   0,1,0,1,0,
   0,1,1,0,1,
     0,0,0};
int [] verticalRectangleLocations22={
    1,1,0,1,
   0,0,1,1,1,0,
   0,1,2,1,0,0,
   0,1,0,0};
levels[22] = new Map(squareLocations22,edgeLocations22,horizontalRectangleLocations22,verticalRectangleLocations22);
int [] squareLocations23= {
	  0,3,3,
        0,1,0,2,0,
        0,0,0,1,0,
          0,2,2};
int [] edgeLocations23={
	 0,1,0,0,
       0,1,0,0,1,0,
       0,0,0,0,1,0,
       0,0,0,0,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations23={
     0,1,1,
   0,1,0,1,0,
   0,1,1,1,0,
   1,0,1,1,0,
     0,0,0};
int [] verticalRectangleLocations23={
    0,1,2,1,
   0,1,0,1,0,0,
   0,1,1,1,1,0,
   0,0,0,0};
levels[23] = new Map(squareLocations23,edgeLocations23,horizontalRectangleLocations23,verticalRectangleLocations23);
int [] squareLocations24= {
	  0,0,0,
        0,0,1,0,0,
        3,3,0,0,0,
          1,0,1};
int [] edgeLocations24={
	 0,0,0,0,
       0,0,0,1,0,0,
       1,0,0,0,1,0,
       0,0,0,0,0,0,
         1,0,0,0};
int [] horizontalRectangleLocations24={
     0,0,0,
   0,1,1,0,0,
   1,0,0,1,0,
   1,1,1,0,1,
     1,0,1};
int [] verticalRectangleLocations24={
    0,0,0,0,
   0,1,0,1,0,0,
   1,2,0,0,1,0,
   1,1,1,1};
levels[24] = new Map(squareLocations24,edgeLocations24,horizontalRectangleLocations24,verticalRectangleLocations24);
int [] squareLocations25= {
	  0,0,0,
        0,0,0,0,1,
        0,0,3,2,0,
          0,3,1};
int [] edgeLocations25={
	 0,0,0,0,
       0,0,0,0,1,0,
       0,0,0,0,0,0,
       0,0,0,0,0,1,
         0,1,0,1};
int [] horizontalRectangleLocations25={
     0,0,0,
   0,0,0,0,1,
   0,0,1,0,1,
   0,1,2,1,1,
     0,1,1};
int [] verticalRectangleLocations25={
    0,0,0,0,
   0,0,0,0,1,1,
   0,1,1,1,1,1,
   0,1,1,1};
levels[25] = new Map(squareLocations25,edgeLocations25,horizontalRectangleLocations25,verticalRectangleLocations25);
		    
int [] squareLocations26={
	  2,1,0,
        0,3,3,2,0,
        0,0,0,1,0,
          0,2,2};
int [] edgeLocations26={
	 0,1,0,0,
       0,1,0,0,1,0,
       0,0,0,0,1,0,
       0,0,0,0,0,0,
         0,0,0,1};
int [] horizontalRectangleLocations26={
     0,1,1,
   0,1,0,1,0,
   0,1,1,1,0,
   1,0,1,1,0,
     0,0,0};
int [] verticalRectangleLocations26={
    0,1,0,1,
   0,1,2,1,0,0,
   0,1,1,1,1,0,
   0,0,0,0};
levels[26] = new Map(squareLocations26,edgeLocations26,horizontalRectangleLocations26,verticalRectangleLocations26);
		    
int [] squareLocations27= {
	  1,3,0,
        0,2,3,0,0,
        1,2,0,0,0,
          0,0,0};
int [] edgeLocations27={
	 1,0,1,0,
       1,0,0,0,0,0,
       0,0,0,0,0,0,
       0,1,0,0,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations27={
     1,1,0,
   1,1,2,1,0,
   1,0,1,0,0,
   1,0,0,0,0,
     0,0,0};
int [] verticalRectangleLocations27={
    1,1,1,0,
   1,1,1,1,1,0,
   1,1,0,0,0,0,
   0,0,0,0};
levels[27] = new Map(squareLocations27,edgeLocations27,horizontalRectangleLocations27,verticalRectangleLocations27);
int [] squareLocations28= {
	  1,2,0,
        2,0,0,1,0,
        1,3,3,2,0,
          0,0,0};
int [] edgeLocations28={
	 0,1,0,0,
       0,0,0,0,1,0,
       0,0,0,0,0,0,
       0,0,0,1,0,0,
         0,1,0,0};
int [] horizontalRectangleLocations28={
     1,0,0,
   1,0,1,1,0,
   1,0,0,1,0,
   1,0,1,0,0,
     1,0,0};
int [] verticalRectangleLocations28={
    1,1,0,0,
   0,1,0,1,1,0,
   1,0,2,1,0,0,
   1,1,0,0};
levels[28] = new Map(squareLocations28,edgeLocations28,horizontalRectangleLocations28,verticalRectangleLocations28);
int [] squareLocations29= {
	  0,0,0,
        0,0,0,2,1,
        0,0,1,3,3,
          0,0,2};
int [] edgeLocations29={
	 0,0,0,1,
       0,0,0,0,0,1,
       0,0,0,0,0,0,
       0,0,1,0,0,1,
         0,0,0,0};
int [] horizontalRectangleLocations29={
     0,0,1,
   0,0,0,1,1,
   0,0,1,1,1,
   0,0,1,1,1,
     0,0,1};
int [] verticalRectangleLocations29={
    0,0,1,1,
   0,0,0,0,1,1,
   0,0,1,1,2,1,
   0,0,0,1};
levels[29] = new Map(squareLocations29,edgeLocations29,horizontalRectangleLocations29,verticalRectangleLocations29);
int [] squareLocations30= {
	  1,1,0,
        2,0,0,0,0,
        3,3,2,2,0,
          0,0,0};
int [] edgeLocations30={
	 1,0,1,0,
       0,0,0,0,1,0,
       0,0,0,1,0,0,
       0,0,0,0,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations30={
     1,1,0,
   1,0,1,1,0,
   1,0,1,0,0,
   1,1,0,0,0,
     0,0,0};
int [] verticalRectangleLocations30={
    1,1,1,0,
   0,1,0,1,1,0,
   1,2,1,0,0,0,
   1,0,0,0};
levels[30] = new Map(squareLocations30,edgeLocations30,horizontalRectangleLocations30,verticalRectangleLocations30);
int [] squareLocations31= {
	  2,2,0,
        0,1,0,0,0,
        3,3,0,1,0,
          0,2,2};
int [] edgeLocations31={
	 0,0,1,0,
       0,0,0,0,1,0,
       1,0,0,0,0,1,
       0,0,0,0,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations31={
     0,1,0,
   0,1,1,1,0,
   1,0,1,0,1,
   1,1,0,1,0,
     0,0,0};
int [] verticalRectangleLocations31={
    0,0,1,0,
   0,1,0,0,1,0,
   1,2,1,1,1,1,
   0,0,0,0};
levels[31] = new Map(squareLocations31,edgeLocations31,horizontalRectangleLocations31,verticalRectangleLocations31);

int [] squareLocations32= {
	  0,0,1,
        1,3,3,2,0,
        0,0,0,0,0,
          0,0,0};
int [] edgeLocations32={
	 0,0,0,0,
       0,0,0,0,1,0,
       1,0,0,0,0,0,
       0,1,0,1,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations32={
     1,0,1,
   1,0,1,1,0,
   1,0,1,0,0,
   0,1,1,0,0,
     0,0,0};
int [] verticalRectangleLocations32={
    1,1,1,1,
   1,0,2,1,0,0,
   0,1,1,1,0,0,
   0,0,0,0};
levels[32] = new Map(squareLocations32,edgeLocations32,horizontalRectangleLocations32,verticalRectangleLocations32);
		    

int [] squareLocations33= {
	  0,1,2,
        0,3,3,0,0,
        0,2,0,1,2,
          2,1,0};
int [] edgeLocations33={
	 0,0,1,0,
       0,0,0,0,1,0,
       0,0,0,0,0,0,
       0,1,0,0,1,0,
         0,0,0,0};
int [] horizontalRectangleLocations33={
     1,1,0,
   0,1,0,1,0,
   0,1,0,1,0,
   0,1,0,1,0,
     0,1,0};
int [] verticalRectangleLocations33={
    0,1,1,0,
   0,1,2,0,1,0,
   0,0,1,0,1,0,
   1,1,1,0};
levels[33] = new Map(squareLocations33,edgeLocations33,horizontalRectangleLocations33,verticalRectangleLocations33);
		    

int [] squareLocations34= {
	  0,0,0,
        0,3,3,0,0,
        0,2,0,0,0,
          1,0,1};
int [] edgeLocations34={
	 0,0,0,0,
       0,0,0,1,0,0,
       0,1,0,0,1,0,
       0,1,0,0,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations34={
     0,0,0,
   0,1,1,0,0,
   0,1,1,1,0,
   0,1,1,0,1,
     1,0,1};
int [] verticalRectangleLocations34={
    0,0,0,0,
   0,1,2,1,0,0,
   0,0,1,0,1,0,
   1,1,1,1};
levels[34] = new Map(squareLocations34,edgeLocations34,horizontalRectangleLocations34,verticalRectangleLocations34);

int [] squareLocations35= {
	  0,0,2,
        0,0,0,3,3,
        0,0,2,0,0,
          1,0,0};
int [] edgeLocations35={
	 0,0,0,0,
       0,0,0,0,0,0,
       0,0,0,1,0,1,
       1,0,0,0,0,0,
         1,0,0,0};
int [] horizontalRectangleLocations35={
     0,0,0,
   0,1,0,1,1,
   0,1,0,1,1,
   1,1,0,1,0,
     1,0,0};
int [] verticalRectangleLocations35={
    0,0,0,0,
   0,0,1,1,2,1,
   1,1,0,0,1,0,
   1,1,0,0};
levels[35] = new Map(squareLocations35,edgeLocations35,horizontalRectangleLocations35,verticalRectangleLocations35);		    

int [] squareLocations36= {
	  0,2,0,
        0,3,3,0,0,
        1,0,2,1,0,
          0,0,0};
int [] edgeLocations36={
	 0,0,1,0,
       0,0,0,0,1,0,
       1,0,0,0,0,1,
       0,0,0,0,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations36={
     0,1,0,
   0,1,1,1,0,
   1,0,1,0,1,
   1,1,0,1,0,
     0,0,0};
int [] verticalRectangleLocations36={
    0,0,1,0,
   0,1,2,0,1,0,
   1,0,1,1,1,1,
   0,0,0,0};
levels[36] = new Map(squareLocations36,edgeLocations36,horizontalRectangleLocations36,verticalRectangleLocations36);    


int [] squareLocations37= {
	  3,0,0,
        1,3,1,0,0,
        0,0,2,0,0,
          0,0,1};
int [] edgeLocations37={
	 0,0,0,0,
       1,0,0,0,0,0,
       0,0,0,0,0,0,
       0,1,0,0,1,0,
         0,1,0,0};
int [] horizontalRectangleLocations37={
     1,0,0,
   1,2,1,0,0,
   1,0,1,0,0,
   0,1,1,1,0,
     0,1,1};
int [] verticalRectangleLocations37={
    1,1,0,0,
   1,0,0,1,0,0,
   0,1,1,0,0,0,
   0,1,0,1};
levels[37] = new Map(squareLocations37,edgeLocations37,horizontalRectangleLocations37,verticalRectangleLocations37);

int [] squareLocations38= {
	  0,0,2,
        0,3,1,0,2,
        2,3,0,0,1,
          0,2,0};
int [] edgeLocations38={
	 0,1,0,0,
       0,1,0,1,0,0,
       0,0,0,0,0,1,
       0,0,0,0,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations38={
     0,1,0,
   0,1,1,0,0,
   1,2,1,1,1,
   0,1,0,0,1,
     0,0,0};
int [] verticalRectangleLocations38={
    0,1,0,0,
   0,1,1,1,0,0,
   1,1,1,0,1,1,
   0,0,0,0};
levels[38] = new Map(squareLocations38,edgeLocations38,horizontalRectangleLocations38,verticalRectangleLocations38);
int [] squareLocations39= {
	  3,3,0,
        0,2,1,0,0,
        0,0,0,0,1,
          0,2,0};
int [] edgeLocations39={
	 0,0,0,1,
       0,1,0,0,0,1,
       0,0,0,0,0,0,
       0,0,0,0,1,0,
         0,0,0,0};
int [] horizontalRectangleLocations39={
     1,1,1,
   0,1,1,0,1,
   0,0,1,1,0,
   0,0,0,0,1,
     0,0,0};
int [] verticalRectangleLocations39={
    1,2,1,1,
   0,0,1,1,0,1,
   0,0,0,1,1,1,
   0,0,0,0};
levels[39] = new Map(squareLocations39,edgeLocations39,horizontalRectangleLocations39,verticalRectangleLocations39);
int [] squareLocations40= {
	  0,0,3,
        0,0,0,3,2,
        0,0,1,0,1,
          0,0,0};
int [] edgeLocations40={
	 0,0,1,0,
       0,0,0,0,0,0,
       0,0,0,0,0,0,
       0,1,0,0,0,1,
         0,1,0,0};
int [] horizontalRectangleLocations40={
     0,0,1,
   0,0,1,2,0,
   0,1,0,1,1,
   0,1,0,0,1,
     0,1,1};
int [] verticalRectangleLocations40={
    0,0,1,1,
   0,0,1,1,1,0,
   0,1,0,0,0,1,
   0,1,0,1};
levels[40] = new Map(squareLocations40,edgeLocations40,horizontalRectangleLocations40,verticalRectangleLocations40);

int [] squareLocations41= {
	  0,3,1,
        0,0,3,2,2,
        0,0,2,1,1,
          0,0,0};
int [] edgeLocations41={
	 0,1,0,0,
       0,0,0,0,0,0,
       0,0,1,0,0,0,
       0,0,0,1,0,1,
         0,0,0,0};
int [] horizontalRectangleLocations41={
     0,1,1,
   0,0,2,1,0,
   0,0,1,1,1,
   0,0,0,1,1,
     0,0,1};
int [] verticalRectangleLocations41={
    0,1,1,1,
   0,0,1,1,0,0,
   0,0,0,1,1,1,
   0,0,0,1};
levels[41] = new Map(squareLocations41,edgeLocations41,horizontalRectangleLocations41,verticalRectangleLocations41);
int [] squareLocations42= {
	  0,2,0,
        0,0,0,3,0,
        1,1,0,3,0,
          0,2,0};
int [] edgeLocations42={
	 0,0,1,0,
       0,0,0,0,1,0,
       1,0,0,0,0,1,
       0,0,0,0,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations42={
     0,1,0,
   0,1,1,1,0,
   1,0,1,2,1,
   1,1,0,1,0,
     0,0,0};
int [] verticalRectangleLocations42={
    0,0,1,0,
   0,1,0,0,1,0,
   1,0,1,1,1,1,
   0,0,0,0};
levels[42] = new Map(squareLocations42,edgeLocations42,horizontalRectangleLocations42,verticalRectangleLocations42);

int [] squareLocations43= {
	  1,3,3,
        0,1,0,0,0,
        0,0,2,0,0,
          0,0,0};
int [] edgeLocations43={
	 1,0,0,0,
       1,0,1,0,1,0,
       0,0,0,0,0,0,
       0,0,0,0,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations43={
     1,1,1,
   1,0,1,1,0,
   0,1,1,0,0,
   0,1,0,0,0,
     1,0,0};
int [] verticalRectangleLocations43={
     1,1,2,1,
   1,1,0,1,0,0,
   0,0,1,0,0,0,
     1,0,0,0};
levels[43] = new Map(squareLocations43,edgeLocations43,horizontalRectangleLocations43,verticalRectangleLocations43);
int [] squareLocations44= {
	  0,0,1,
        1,0,0,3,3,
        0,0,0,0,0,
          0,0,0};
int [] edgeLocations44={
	 0,0,0,1,
       0,0,0,0,0,1,
       0,1,0,0,0,0,
       0,0,0,0,1,0,
         0,0,0,0};
int [] horizontalRectangleLocations44={
     1,0,1,
   1,0,1,0,1,
   1,0,0,1,0,
   0,0,0,0,1,
     0,0,0};
int [] verticalRectangleLocations44={
     1,1,1,1,
   1,1,0,1,2,1,
   0,0,0,0,1,1,
     0,0,0,0};
levels[44] = new Map(squareLocations44,edgeLocations44,horizontalRectangleLocations44,verticalRectangleLocations44);	   

int [] squareLocations45= {
	  0,0,0,
        0,0,0,3,3,
        0,2,0,0,2,
          0,1,1};
int [] edgeLocations45={
	 0,0,0,0,
       0,0,0,0,0,0,
       0,0,1,0,0,0,
       0,1,0,0,0,0,
         0,1,0,1};
int [] horizontalRectangleLocations45={
     0,0,0,
   0,0,0,1,1,
   0,0,1,0,1,
   0,1,1,0,1,
     0,1,1};
int [] verticalRectangleLocations45={
     0,0,0,1,
   0,0,0,1,2,1,
   0,1,1,0,1,0,
     0,1,1,1};
levels[45] = new Map(squareLocations45,edgeLocations45,horizontalRectangleLocations45,verticalRectangleLocations45);
int [] squareLocations46= {
	  2,2,0,
        1,0,3,3,0,
        0,0,2,0,0,
          0,0,0};
int [] edgeLocations46={
	 0,0,0,0,
       0,0,0,0,1,0,
       0,1,0,0,0,1,
       0,0,0,1,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations46={
     1,0,0,
   1,0,1,1,0,
   1,0,1,0,1,
   0,0,0,1,0,
     0,0,0};
int [] verticalRectangleLocations46={
     1,1,1,0,
   1,1,1,2,1,0,
   0,0,0,1,1,1,
     0,0,0,0};
levels[46] = new Map(squareLocations46,edgeLocations46,horizontalRectangleLocations46,verticalRectangleLocations46);

int [] squareLocations47= {
	  1,0,3,
        0,2,1,3,0,
        0,2,2,2,0,
          0,0,0};
int [] edgeLocations47={
	 0,0,0,1,
       0,1,0,0,0,1,
       0,0,0,0,0,0,
       0,0,0,0,1,0,
         0,0,0,0};
int [] horizontalRectangleLocations47={
     1,1,1,
   0,1,1,2,1,
   0,0,1,1,0,
   0,0,0,0,1,
     0,0,0};
int [] verticalRectangleLocations47={
     1,0,1,1,
   0,0,1,1,0,1,
   0,0,0,1,1,1,
     0,0,0,0};
levels[47] = new Map(squareLocations47,edgeLocations47,horizontalRectangleLocations47,verticalRectangleLocations47);
int [] squareLocations48= {
	  2,1,0,
        0,2,0,3,2,
        0,1,2,3,0,
          0,0,0};
int [] edgeLocations48={
	 1,0,1,0,
       0,0,0,0,1,0,
       0,1,0,0,0,0,
       0,0,0,0,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations48={
     1,1,0,
   0,0,1,1,0,
   0,1,1,2,1,
   0,1,0,1,0,
     0,0,0};
int [] verticalRectangleLocations48={
     1,1,1,0,
   0,0,1,0,1,0,
   0,1,1,1,1,0,
     0,0,0,0};
levels[48] = new Map(squareLocations48,edgeLocations48,horizontalRectangleLocations48,verticalRectangleLocations48);

int [] squareLocations49= {
	  3,1,2,
        0,3,2,1,0,
        0,0,0,0,0,
          0,0,0};
int [] edgeLocations49={
	 1,0,1,0,
       0,0,0,0,1,0,
       0,0,0,0,0,0,
       0,0,0,0,1,0,
         0,0,0,0};
int [] horizontalRectangleLocations49={
     1,1,0,
   1,2,1,1,0,
   0,1,0,1,0,
   0,0,0,0,1,
     0,0,0};
int [] verticalRectangleLocations49={
     1,1,1,0,
   1,1,1,1,1,0,
   0,0,0,0,1,1,
     0,0,0,0};
levels[49] = new Map(squareLocations49,edgeLocations49,horizontalRectangleLocations49,verticalRectangleLocations49);
int [] squareLocations50= {
	  0,0,0,
        0,1,0,0,0,
        2,3,2,1,2,
          3,0,0};
int [] edgeLocations50={
	 0,0,0,0,
       0,1,0,0,0,0,
       0,0,0,0,0,0,
       0,0,0,0,1,0,
         1,0,1,0};
int [] horizontalRectangleLocations50={
     0,0,0,
   0,1,0,0,0,
   0,1,0,1,0,
   1,2,1,1,0,
     1,1,0};
int [] verticalRectangleLocations50={
     0,0,0,0,
   0,1,1,0,0,0,
   1,1,1,1,1,0,
     1,1,1,0};
levels[50] = new Map(squareLocations50,edgeLocations50,horizontalRectangleLocations50,verticalRectangleLocations50);
int [] squareLocations51= {
	  1,2,1,
        0,0,0,3,3,
        0,0,0,0,2,
          0,0,0};
int [] edgeLocations51={
	 0,0,0,1,
       0,0,0,0,0,0,
       0,1,0,0,0,1,
       0,0,1,0,0,0,
         0,0,1,0};
int [] horizontalRectangleLocations51={
     1,0,1,
   1,0,1,1,1,
   0,1,0,0,1,
   0,0,1,1,0,
     0,0,0};
int [] verticalRectangleLocations51={
     1,1,1,1,
   0,1,0,0,2,1,
   0,0,1,0,1,0,
     0,0,0,0};
levels[51] = new Map(squareLocations51,edgeLocations51,horizontalRectangleLocations51,verticalRectangleLocations51);

int [] squareLocations52= {
	  0,0,0,
        3,3,0,0,0,
        0,0,0,0,1,
          0,0,0};
int [] edgeLocations52={
	 0,0,0,0,
       1,0,1,0,0,0,
       0,0,0,0,0,0,
       0,0,0,0,0,1,
         0,0,0,1};
int [] horizontalRectangleLocations52={
     1,0,0,
   1,1,0,0,0,
   1,1,1,0,1,
   0,0,0,1,1,
     0,0,1};
int [] verticalRectangleLocations52={
     1,0,0,0,
   1,2,1,0,0,0,
   0,0,1,1,1,1,
     0,0,0,1};
levels[52] = new Map(squareLocations52,edgeLocations52,horizontalRectangleLocations52,verticalRectangleLocations52);
int [] squareLocations53= {
	  0,0,0,
        0,1,2,1,0,
        0,3,3,2,0,
          2,1,2};
int [] edgeLocations53={
	 0,0,0,0,
       0,0,0,0,0,0,
       0,0,0,0,1,0,
       0,1,0,0,0,0,
         0,1,0,1};
int [] horizontalRectangleLocations53={
     0,0,0,
   0,1,0,1,0,
   1,0,1,1,0,
   0,1,1,0,0,
     0,1,1};
int [] verticalRectangleLocations53={
     0,0,0,0,
   0,1,1,1,1,0,
   0,1,2,1,0,0,
     0,1,1,1};
levels[53] = new Map(squareLocations53,edgeLocations53,horizontalRectangleLocations53,verticalRectangleLocations53);

int [] squareLocations54= {
	  3,2,1,
        0,3,0,2,0,
        0,2,1,2,0,
          0,0,0};
int [] edgeLocations54={
	 0,0,0,0,
       0,0,0,0,1,0,
       0,1,0,0,0,0,
       0,0,1,0,1,0,
         0,0,0,0};
int [] horizontalRectangleLocations54={
     1,0,1,
   1,2,1,1,0,
   0,1,1,0,0,
   0,0,1,1,0,
     0,0,0};
int [] verticalRectangleLocations54={
     1,1,1,1,
   0,1,0,1,0,0,
   0,0,1,1,1,0,
     0,0,0,0};
levels[54] = new Map(squareLocations54,edgeLocations54,horizontalRectangleLocations54,verticalRectangleLocations54);
int [] squareLocations55= {
	  0,0,0,
        1,0,0,0,0,
        0,2,3,3,0,
          0,0,1};
int [] edgeLocations55={
	 1,0,0,0,
       1,0,0,0,0,0,
       0,0,0,0,1,0,
       0,0,0,0,0,0,
         0,0,1,0};
int [] horizontalRectangleLocations55={
     1,0,0,
   1,1,0,0,0,
   1,0,1,1,0,
   0,0,1,1,0,
     0,0,1};
int [] verticalRectangleLocations55={
     1,0,0,0,
   1,1,1,1,0,0,
   0,0,1,2,1,0,
     0,0,1,1};
levels[55] = new Map(squareLocations55,edgeLocations55,horizontalRectangleLocations55,verticalRectangleLocations55);

int [] squareLocations56= {
	  0,0,0,
        0,2,2,2,0,
        0,1,0,3,0,
          2,1,3};
int [] edgeLocations56={
	 0,0,0,0,
       0,1,0,0,0,0,
       0,0,0,0,0,0,
       0,1,0,0,0,0,
         0,1,0,1};
int [] horizontalRectangleLocations56={
     0,0,0,
   1,0,0,0,0,
   0,1,0,1,0,
   0,1,1,2,1,
     0,1,1};
int [] verticalRectangleLocations56={
     0,0,0,0,
   1,1,0,0,0,0,
   0,1,1,1,1,1,
     0,1,1,1};
levels[56] = new Map(squareLocations56,edgeLocations56,horizontalRectangleLocations56,verticalRectangleLocations56);
int [] squareLocations57= {
	  0,2,0,
        1,3,3,0,0,
        1,0,2,0,0,
          2,2,0};
int [] edgeLocations57={
	 0,1,0,0,
       1,0,0,0,0,0,
       0,0,0,0,0,0,
       1,0,0,0,0,0,
         1,0,0,0};
int [] horizontalRectangleLocations57={
     1,0,0,
   1,0,1,0,0,
   0,0,1,0,0,
   1,1,0,1,0,
     1,0,0};
int [] verticalRectangleLocations57={
     1,1,0,0,
   1,1,2,1,0,0,
   1,0,1,1,1,0,
     1,0,0,0};
levels[57] = new Map(squareLocations57,edgeLocations57,horizontalRectangleLocations57,verticalRectangleLocations57);

int [] squareLocations58= {
	  0,1,2,
        0,2,2,2,0,
        0,0,3,3,0,
          0,0,0};
int [] edgeLocations58={
	 0,1,0,1,
       0,1,0,0,0,0,
       0,0,0,0,1,0,
       0,0,0,0,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations58={
     0,1,1,
   0,1,1,0,1,
   0,0,1,1,0,
   0,0,1,1,0,
     0,0,0};
int [] verticalRectangleLocations58={
     0,1,1,1,
   0,1,0,1,0,1,
   0,0,1,2,1,0,
     0,0,1,0};
levels[58] = new Map(squareLocations58,edgeLocations58,horizontalRectangleLocations58,verticalRectangleLocations58);

int [] squareLocations59= {
	  2,1,2,
        0,0,2,2,0,
        0,0,3,3,0,
          0,0,0};
int [] edgeLocations59={
	 0,1,0,1,
       0,1,0,0,0,0,
       0,0,0,0,1,0,
       0,0,0,0,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations59={
     0,1,1,
   0,1,1,0,1,
   0,0,1,1,0,
   0,0,1,1,0,
     0,0,0};
int [] verticalRectangleLocations59={
     0,1,1,1,
   0,1,0,1,0,1,
   0,0,1,2,1,0,
     0,0,1,0};
levels[59] = new Map(squareLocations59,edgeLocations59,horizontalRectangleLocations59,verticalRectangleLocations59);

int [] squareLocations60= {
	  0,0,0,
        0,2,3,3,0,
        0,1,2,2,0,
          0,0,0};
int [] edgeLocations60={
	 0,0,0,0,
       0,1,0,0,1,0,
       0,0,0,0,0,0,
       0,1,0,0,0,0,
         0,1,0,0};
int [] horizontalRectangleLocations60={
     0,1,0,
   1,0,1,1,0,
   0,1,1,1,0,
   0,1,0,0,0,
     0,1,0};
int [] verticalRectangleLocations60={
     0,0,1,0,
   1,1,1,2,1,0,
   0,1,1,1,0,0,
     0,1,0,0};
levels[60] = new Map(squareLocations60,edgeLocations60,horizontalRectangleLocations60,verticalRectangleLocations60);
int [] squareLocations61= {
	  0,0,0,
        0,3,0,0,1,
        1,3,0,0,0,
          0,0,0};
int [] edgeLocations61={
	 0,0,0,0,
       0,0,0,0,0,0,
       1,0,0,0,0,1,
       0,0,1,0,1,0,
         0,0,0,0};
int [] horizontalRectangleLocations61={
     0,0,0,
   0,1,1,0,1,
   1,2,0,1,1,
   1,1,0,1,0,
     0,0,0};
int [] verticalRectangleLocations61={
     0,0,0,0,
   0,1,1,1,1,1,
   1,1,1,0,1,0,
     0,0,0,0};
levels[61] = new Map(squareLocations61,edgeLocations61,horizontalRectangleLocations61,verticalRectangleLocations61);
int [] squareLocations62= {
	  0,0,0,
        0,2,3,2,0,
        0,1,3,2,0,
          0,1,0};
int [] edgeLocations62={
	 0,1,0,0,
       0,0,0,1,0,0,
       0,0,1,0,0,0,
       0,0,0,0,0,0,
         0,1,0,0};
int [] horizontalRectangleLocations62={
     1,0,0,
   0,0,1,0,0,
   0,1,2,1,0,
   0,1,1,0,1,
     0,1,0};
int [] verticalRectangleLocations62={
     0,1,0,0,
   0,1,1,1,0,0,
   0,1,0,1,1,1,
     0,1,1,0};
levels[62] = new Map(squareLocations62,edgeLocations62,horizontalRectangleLocations62,verticalRectangleLocations62);

int [] squareLocations63={
	  1,0,0,
        0,2,0,2,0,
        0,1,3,0,0,
          0,3,0};
int [] edgeLocations63={
	 1,0,0,0,
       0,0,0,1,0,0,
       0,0,1,0,1,0,
       0,0,0,0,0,0,
         0,0,0,0};
int [] horizontalRectangleLocations63={
     1,0,0,
   0,1,1,0,0,
   0,1,0,1,0,
   1,1,2,1,0,
     0,1,0};
int [] verticalRectangleLocations63={
     1,1,0,0,
   0,0,1,1,0,0,
   0,1,0,0,1,0,
     1,1,1,0};
levels[63] = new Map(squareLocations63,edgeLocations63,horizontalRectangleLocations63,verticalRectangleLocations63);

		   }
    public Map[] getLevels() {
        return levels;
    }
}
