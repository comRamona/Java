#include <fstream>
#include <string>
#include <cstring>
#include <iostream>
using namespace std;
ifstream fin("f.in");
int main()
{
char s[101];
fin>>s;
while(strlen(s))
{
cout<<s<<'\n';
strcpy(s,s+1);
strcpy(s+strlen(s)-1,s+strlen(s));
}
fin.close();
return 0;
}
