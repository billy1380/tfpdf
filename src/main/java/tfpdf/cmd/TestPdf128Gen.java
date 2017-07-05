/**
 * test_pdf128_gen.php
 *
 * @author David Wilcock <dwilcock@doc-net.com>
 * @copyright Venditan Limited 2016
 */

package tfpdf.cmd;

require_once __DIR__ . '/../vendor/autoload.php';

class TestPdf128Gen {

public static void main (String[] args) {

$obj_pdf = new \tFPDF\PDFBarcode();
$obj_pdf->AddPage();

$obj_pdf->Code128(5, 5, '1234566700345', 50, 50);
$str_file = sys_get_temp_dir() . '/tfpdf_code128_test.pdf';
file_put_contents($str_file, $obj_pdf->output());

echo "Written file " . $str_file . PHP_EOL;
}
}