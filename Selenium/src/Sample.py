import os
from pywinauto.application import Application
from pywinauto.application import time
from pywinauto.application import findwindows
app3 = Application().Connect(title=u'Calculator', class_name='CalcFrame')
calcframe = app3.CalcFrame

os.system("taskkill /f /im ThingworxNavigate-MSSQL-1.8.0-SNAPSHOT-windows-installer.exe")
app = Application(backend="uia").start('D:\Navigate\Installer\installbuilder-navigate-only-1.0-SNAPSHOT\ThingworxNavigate-MSSQL-1.8.0-SNAPSHOT-windows-installer.exe')

time.sleep(10)
app2 = Application().connect(title=u'ThingWorx Navigate Setup', class_name='TkTopLevel')
dlg=app2.top_window()
print app2[u'ThingWorx Navigate Setup'][u'Static2'].legacy_properties()['Value']
#tktoplevel = app2.TkTopLevel
#tkchild = tktoplevel[u'8']
#print tkchild.Properties.texts()
#childWindow=app2.Properties.child_window(title=u'ThingWorx Navigate Setup', class_name='Static')
#app.Properties.child_window(title=u'ThingWorx Navigate Setup', class_name='Static').WindowText()
#tktoplevel = app2.
#childWindow=app2(title=u'ThingWorx Navigate Setup', class_name='Static')
#childWindow1=childWindow.Static
#print childWindow.Properties.Static2.WindowText
#tkchild = tktoplevel[u'15']
#tktoplevel.
#tktoplevel.Static1.WindowText()
#tktoplevel = app2.TkTopLevel
#tktoplevel.CloseClick()

#print app2.PrintControlIdentifiers()
#os.system("taskkill /f /im ThingworxNavigate-MSSQL-1.8.0-SNAPSHOT-windows-installer.exe")
#tktoplevel.close(15)
#w_about_handle = findwindows.find_windows(title=u'ThingWorx Navigate Setup', class_name='TkTopLevel')[0]
#w_about = app2.window(handle=w_about_handle)
#w_about = app2.window
#w_about.type_keys('%{F4}')
#time.sleep(5)

#app3 = Application().connect(title=u'Question', class_name='#32770')
#w_about.close()
#button = window1[u'&Yes']
#button.click()
