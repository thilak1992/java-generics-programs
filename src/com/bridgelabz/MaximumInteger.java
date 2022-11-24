package com.bridgelabz;

    public class MaximumInteger{

        public static void findMaximum(Float floatNumber1,Float floatNumber2,Float floatNumber3)
        {
            if(floatNumber1.compareTo(floatNumber2)>0)
            {
                if(floatNumber1.compareTo(floatNumber3)>0)
                {
                    System.out.println("The maximum value is "+floatNumber1);

                }
                else
                {
                    System.out.println("The maximum value is "+floatNumber3);
                }


            }
            else
            {
                if(floatNumber2.compareTo(floatNumber3)>0)
                {
                    System.out.println("The maximum value is "+floatNumber2);

                }
                else
                {
                    System.out.println("The maximum value is "+floatNumber3);

                }

            }




        }

        public static void main(String[] args)
        {

            System.out.println("------------welcome to maximum problem program------------");
            Float floatNumber1=1f,floatNumber2=7f,floatNumber3=4f;
            findMaximum(floatNumber1, floatNumber2, floatNumber3);

        }


    }

