import { registerPlugin } from '@capacitor/core';

import type { SunmiPayPlugin } from './definitions';

const SunmiPay = registerPlugin<SunmiPayPlugin>('SunmiPay', {
  web: () => import('./web').then(m => new m.SunmiPayWeb()),
});

export * from './definitions';
export { SunmiPay };
