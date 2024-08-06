# construction-enegineering-tech-challenge
Technical Challenge

Given a string with the following data (it includes multiple lines):
2343225,2345,us_east,RedTeam,ProjectApple,3445s
1223456,2345,us_west,BlueTeam,ProjectBanana,2211s
3244332,2346,eu_west,YellowTeam3,ProjectCarrot,4322s
1233456,2345,us_west,BlueTeam,ProjectDate,2221s
3244132,2346,eu_west,YellowTeam3,ProjectEgg,4122s 
 
The data is organized into columns delimited by a comma (,) in the following order:
customerId,contractId,geozone,teamcode,projectcode,buildduration 
 
The first line of data would then be interpreted as
2343225 is the customerId  
2345 is the contractId
us_east is the geozone  
RedTeam is the teamcode  
ProjectApple is the projectcode  
3445s is the buildduration 
 
Write an application using Java that would consume the entire multiline string as the input
and produce the following report as the output
The number of unique customerId for each contractId
The number of unique customerId for each geozone
The average buildduration for each geozone
The list of unique customerId for each geozone 
 
Please pay attention to the code quality and SOLID design principals. Fluent usage of
design patterns and test-driven development practices are highly regarded.
Send your submission as a link to a git repository. Clear, simple instructions to build and run
will be appreciated. Please refrain from using third-party libraries except for what is required
for testing (e.g., JUnit).
