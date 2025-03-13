import React from 'react';
import { createRoot } from 'react-dom/client';
import App from "./App";
import {getFilmInfo} from "./api";

const root = createRoot(document.getElementById('root'));

root.render(
   React.createElement('button', {
       onClick: async () => console.log(await getFilmInfo())

}, 'Hello')
);