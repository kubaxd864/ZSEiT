const electron = require('electron');
const { app, BrowserWindow } = electron;
const path = require('path');
let mainWindow;

app.on('ready', () => {
    mainWindow = new BrowserWindow({
        webPreferences: {
            nodeIntegration: true,
            contextIsolation: false,
        }
    });
    mainWindow.loadURL(`${app.getAppPath()}\\build\\index.html`);
});

