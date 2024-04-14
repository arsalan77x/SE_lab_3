
## SOLID دستور آزمایش

### گام ۱: افزودن یک روش پیام رسانی دیگر

1.	بدون آن که متدی را از واسط Messaging Service حذف کنید ، یک سرویس دیگری را به منظور ارسال پیام از تلگرام با داشتن آیدی مبدا و آیدی مقصد ایجاد کنید - به تبع آن لازم است که یک زیر کلاس برای Message به نام Telegeram Message اضافه کنید که در آن سرویس مورد استفاده قرار گیرد.
2.	سپس یک تابع برای ارسال پیام تلگرامی در واسط Message Service اضافه کنید.
3.	در بدنه‌ی تابع مذکور - مشابه با دیگر توابع پیاده سازی شده -  از یک دستور چاپ ساده بر روی صفحه نمایش استفاده کنید.
4.	در ادامه، سعی کنید که قابلیت ارسال پیام تلگرامی را نیز به برنامه اضافه کنید؛ یعنی کاری کنید که کاربر بتواند در قالب روش سوم پیام خود را با داشتن آیدی مبدا و آیدی مقصد و متن پیام، ارسال کند.
5.	تغییراتی را که در کد فعلی برنامه می‌دهید، در جدول زیر ثبت کنید و در نهایت تعداد کل تغییرات را اعلان کنید.
    - توجه: مواردی که به عنوان تغییرات باید اعلان شود شامل این موارد هستند:
      1. ساخت کلاس جدید
      2. افزودن تابع جدید به کلاس و یا واسط (برای توابع جدید صرفا اعلام تغییر کنید)
      3. هر خطوط پیاپی‌ای که در تابع main و برای افزودن یک قابلیت جدید اضافه می‌کنید. به عنوان مثال اگر سه خط را به منظور تشخیص نوع پیام اضافه می‌کنید، آن سه خط را در قالب یک تغییر اعلام کنید (البته جزییات آن را در ستون «شرحی کوتاه از تغییر» توضیح دهید).

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>1</strong></p>
</td>
<td width="198">
<p>MessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendTelegramMessage</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>2</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>اضافه کردن کلاس</p>
</td>
<td width="292">
<p>این کلاس مربوط به توابع سرویس‌دهنده به پیام‌رسانی از طریق تلگرام است</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>3</strong></p>
</td>
<td width="198">
<p>TelegramMessage </p>
</td>
<td width="141">
<p>اضافه کردن کلاس</p>
</td>
<td width="292">
<p>این کلاس مدل مربوط به پیام‌رسان تلگرام است که برای get و set کردن id مربوط به مبدا و مقصد است.</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>4</strong></p>
</td>
<td width="198">
<p>SmsMessageService </p>
</td>
<td width="141">
<p>اضافه کردن تابع sendTelegramMessage  </p>
</td>
<td width="292">
<p>تابع با بدنه‌ی خالی اضافه می‌کنیم  که override شده.</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>5</strong></p>
</td>
<td width="198">
<p>EmailMessageService </p>
</td>
<td width="141">
<p>اضافه کردن تابع sendTelegramMessage  </p>
</td>
<td width="292">
<p>تابع با بدنه‌ی خالی اضافه می‌کنیم  که override شده.</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>6</strong></p>
</td>
<td width="198">
<p>TelegramMessageService </p>
</td>
<td width="141">
<p>اضافه کردن توابع سرویس پیام تلگرامی	</p>
</td>
<td width="292">
<p>	4 تابع که 2 تا مربوط به ارسال پیام و صحت‌سنجی id هستند و دوتای دیگر مربوط به دو شیوه‌ی دیگر با دامنه‌‌ی خالی هستند.</p>
</td>
</tr>


<tr>
<td width="64">
<p><strong>7</strong></p>
</td>
<td width="198">
<p>Main </p>
</td>
<td width="141">
<p>امکان prompt گرفتن از کاربر و مدیریت آن با صدا کردن توابع کلاس مربوطه. </p>
</td>
<td width="292">
<p>امکان prompt گرفتن از کاربر و مدیریت آن با صدا کردن توابع کلاس مربوطه.</p>
</td>
</tr>
</tbody>
</table>

مجموع تعداد تغییرات: 7

### گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID
در خصوص این برنامه‌ای که نوشته شده بود و شما یک قابلیت به آن اضافه کردید، بر اساس اصول SOLID موارد نقض و یا محقق شدن هر کدام از آن اصول را بیان کنید. در بیان موارد تحقق و نقض، علت تحقق و یا نقض را نیز به صورت کامل توضیح دهید:

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>در مدلها رعایت شده. زیرا 3 کلاس فرزند هر کدام یک کار را می‌کنند. اگرچه برای حل عدم رعایت این اصل در بخش سرویس می‌توان این مدل‌ها را تلفیق کرد و همچنان مدل یک کار کند.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>سرویس MessageService 3 کار انجام می‌دهد. همچنین در هر کدام از سه سرویس دو کار validateion و send انجام شده.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>مدل ها مطابقت دارند.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>کلاس‌های Main و Message Service ندارند. اگر ارسال پیام با تلگرام را اضافه کنیم نیاز دارد تا تغییر کند.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p> In principle, anywhere a Message object is expected, any of its subclasses (EmailMessage, SmsMessage, TelegramMessage) should be able to substitute without causing errors or changing the behavior of the program.  The message subclasses seem to adhere to LSP since they extend functionality without changing existing behavior expected by code that uses the Message base class.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>The specific implementation of MessageService methods and the reliance on type checking suggest a violation of LSP. This design forces implementers to know details about subclasses, which should ideally be unnecessary.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>در کلاس ها رعایت شده، هر کلاس پیاده سازی فقط متدهای مربوط به نوع سرویس سفارش خاص خود را پیاده سازی میکند. </p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>For EmailMessageService, implementing sendSmsMessage and sendTelegramMessage is unnecessary and forces the service to depend on methods that it does not use, which is a clear violation of ISP.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>

در خصوص هرکدام از موارد نقض هرکدام از اصول، یک راهکار را به منظور رفع آن مشکل ارایه داده و در جدول زیر ثبت نمایید:

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>

### گام ۳: اصلاح موارد نقض
در نهایت، بر اساس تحلیلی که انجام داده‌اید و راه حل‌هایی که در بخش قبل ارایه کردید، کد را اصلاح کرده و بر روی مخزن گیت‌هاب و در پوشه‌ای مجزا از گام قبل commit و push کنید. انتظار می‌رود که تمامی راه حل‌های پیشنهادی خود را بر روی این نسخه اعمال کنید و تمامی بهبودهایی که انجام می‌دهید، در جداول بخش قبل موجود باشد.

### گام ۴: بررسی مجدد تغییرات مورد نیاز
فرض کنید که گام 1 را برای کد اصلاح شده (پس از انجام گام‌های ۲ و ۳) اجرا کرده‌اید.
1. در این صورت از انجام کدام یک از تغییرات ثبت شده در جدول گام ۱ معاف خواهید شد؟
2. تعداد تغییرات مورد نیاز، چند تغییر خواهد شد؟

### گام ۵: جمع بندی
در این بخش، بیان کنید که از این گام چه نتیجه‌ای گرفته‌اید؟ و به نظر شما به کارگیری صحیح اصول SOLID در گام‌های ۳ و ۴ چه مزایایی را نسبت به حالتی دارد که این اصول رعایت نشده‌بود؟

## نحوه ارسال پروژه:
1.	گام ۱ را انجام داده و سپس کد نوشته شده‌ی خود را (با رعایت محدودیت‌های گفته شده در گام) در یک پوشه به نام Step_1_Non_SOLID ذخیره کنید و در مخزن گام ۲ قرار دهید. موارد توضیحی بایستی در بخش README مخزن قرار گیرد.
2.	گام ۲ (که بخش تحلیلی است) در فایل README مربوط به مخزن گام ۲ آورده شود (تمام جداول با فرمت داده شده و عناوین هرکدام از سوالات پرسیده شده بایستی در README آورده شود).
3.	گام ۳ که شامل بهبود است، بایستی به صورت جداگانه در پوشه دیگری به نام Step_3_With_SOLID قرار داده شود و در مخزن موجود باشد.
4.	گام ۴ نیز در قالب توضیحات در README مخزن آورده شود.
5.	گام ۵ (که نتیجه گیری است) در README مخزن آورده شود.
