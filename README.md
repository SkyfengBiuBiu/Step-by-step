# Step-by-step
just some god idea

First, the "RedPacket.java" displays the easiset way to distrbute the money. 
The main idea of it is "num=num-num/people*N". With the static data, to control the value of money seems to achieve this aim.
However, it may lead to produce the negative result.

Then I used the "test.java" and "main.java" to solve this.
1. set the static data to limit the value of red packet
2. write the isRight function to judge the result
3. use the randomRedPacket to produce the packet. If the packet is illegal, the method will reproduce another number with this function.
The important point is to perform this function in this method.
4. To avoid the one packet including too large value, I reset the max limit and applied the List construct to save the data 
5. In the main function, people could enter the random value for money and numerb and get result from the console.

