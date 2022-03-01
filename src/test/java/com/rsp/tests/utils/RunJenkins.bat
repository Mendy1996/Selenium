@ECHO OFF

echo ####################
echo # Starting Jenkins #
echo ####################
C:
CD C:\Jenkins
java -Dhudson.model.DirectoryBrowserSupport.CSP="sandbox; default-src 'none'; img-src 'self'; style-src 'self';" -jar jenkins.war